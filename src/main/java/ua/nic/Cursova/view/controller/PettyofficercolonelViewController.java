package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.PettyofficercolonelEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class PettyofficercolonelViewController {
    @Autowired
    private IEntityService pettyofficercolonelService;

    @GetMapping("/pettyofficercolonelList")
    public String getAllPettyofficercolonel (Model model) {
        model.addAttribute("pettyofficercolonelList", pettyofficercolonelService.getAll());
        model.addAttribute("pettyofficercolonelEntity", new PettyofficercolonelEntity());
        return "pettyofficercolonelList.html";
    }

    @RequestMapping(value = "/pettyofficercolonelList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deletePettyofficercolonel (
            ModelAndView modelAndView,
            @Valid PettyofficercolonelEntity pettyofficercolonelEntity,
            BindingResult result) {
        pettyofficercolonelService.delete(pettyofficercolonelEntity.getId());
        modelAndView.setViewName("redirect:/pettyofficercolonelList");
        return modelAndView;
    }
    @RequestMapping(value = "/pettyofficercolonelList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addPettyofficercolonel (
            ModelAndView modelAndView,
            @Valid PettyofficercolonelEntity pettyofficercolonelEntity,
            BindingResult result) {
        pettyofficercolonelService.save(pettyofficercolonelEntity);
        modelAndView.setViewName("redirect:/pettyofficercolonelList");
        return modelAndView;
    }
    @RequestMapping(value = "/pettyofficercolonelList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updatePettyofficercolonel (
            ModelAndView modelAndView,
            @Valid PettyofficercolonelEntity pettyofficercolonelEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            pettyofficercolonelService.delete(pettyofficercolonelEntity.getId());
            pettyofficercolonelService.save(pettyofficercolonelEntity);
            modelAndView.getModel().put("pettyofficercolonel", pettyofficercolonelEntity);
            modelAndView.setViewName("redirect:/pettyofficercolonelList");
        }
        return modelAndView;
    }

}

