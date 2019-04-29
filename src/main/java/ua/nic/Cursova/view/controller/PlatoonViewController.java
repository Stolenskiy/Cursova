package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.PlatoonEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class PlatoonViewController {
    @Autowired
    private IEntityService platoonService;

    @GetMapping("/platoonList")
    public String getAllPlatoon (Model model) {
        model.addAttribute("platoonList", platoonService.getAll());
        model.addAttribute("platoonEntity", new PlatoonEntity());
        return "platoonList.html";
    }

    @RequestMapping(value = "/platoonList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deletePlatoon (
            ModelAndView modelAndView,
            @Valid PlatoonEntity platoonEntity,
            BindingResult result) {
        platoonService.delete(platoonEntity.getId());
        modelAndView.setViewName("redirect:/platoonList");
        return modelAndView;
    }
    @RequestMapping(value = "/platoonList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addPlatoon (
            ModelAndView modelAndView,
            @Valid PlatoonEntity platoonEntity,
            BindingResult result) {
        platoonService.save(platoonEntity);
        modelAndView.setViewName("redirect:/platoonList");
        return modelAndView;
    }
    @RequestMapping(value = "/platoonList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updatePlatoon (
            ModelAndView modelAndView,
            @Valid PlatoonEntity platoonEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            platoonService.delete(platoonEntity.getId());
            platoonService.save(platoonEntity);
            modelAndView.getModel().put("platoon", platoonEntity);
            modelAndView.setViewName("redirect:/platoonList");
        }
        return modelAndView;
    }

}

