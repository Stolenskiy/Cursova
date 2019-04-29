package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.PettyofficerEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class PettyofficerViewController {
    @Autowired
    private IEntityService pettyofficerService;

    @GetMapping("/pettyofficerList")
    public String getAllPettyofficer (Model model) {
        model.addAttribute("pettyofficerList", pettyofficerService.getAll());
        model.addAttribute("pettyofficerEntity", new PettyofficerEntity());
        return "pettyofficerList.html";
    }

    @RequestMapping(value = "/pettyofficerList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deletePettyofficer (
            ModelAndView modelAndView,
            @Valid PettyofficerEntity pettyofficerEntity,
            BindingResult result) {
        pettyofficerService.delete(pettyofficerEntity.getId());
        modelAndView.setViewName("redirect:/pettyofficerList");
        return modelAndView;
    }
    @RequestMapping(value = "/pettyofficerList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addPettyofficer (
            ModelAndView modelAndView,
            @Valid PettyofficerEntity pettyofficerEntity,
            BindingResult result) {
        pettyofficerService.save(pettyofficerEntity);
        modelAndView.setViewName("redirect:/pettyofficerList");
        return modelAndView;
    }
    @RequestMapping(value = "/pettyofficerList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updatePettyofficer (
            ModelAndView modelAndView,
            @Valid PettyofficerEntity pettyofficerEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            pettyofficerService.delete(pettyofficerEntity.getId());
            pettyofficerService.save(pettyofficerEntity);
            modelAndView.getModel().put("pettyofficer", pettyofficerEntity);
            modelAndView.setViewName("redirect:/pettyofficerList");
        }
        return modelAndView;
    }

}

