package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.AutomxaticweaponEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class AutomxaticweaponViewController {
    @Autowired
    private IEntityService automxaticweaponService;

    @GetMapping("/automxaticweaponList")
    public String getAllAutomxaticweapon (Model model) {
        model.addAttribute("automxaticweaponList", automxaticweaponService.getAll());
        model.addAttribute("automxaticweaponEntity", new AutomxaticweaponEntity());
        return "automxaticweaponList.html";
    }

    @RequestMapping(value = "/automxaticweaponList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteAutomxaticweapon (
            ModelAndView modelAndView,
            @Valid AutomxaticweaponEntity automxaticweaponEntity,
            BindingResult result) {
        automxaticweaponService.delete(automxaticweaponEntity.getId());
        modelAndView.setViewName("redirect:/automxaticweaponList");
        return modelAndView;
    }
    @RequestMapping(value = "/automxaticweaponList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addAutomxaticweapon (
            ModelAndView modelAndView,
            @Valid AutomxaticweaponEntity automxaticweaponEntity,
            BindingResult result) {
        automxaticweaponService.save(automxaticweaponEntity);
        modelAndView.setViewName("redirect:/automxaticweaponList");
        return modelAndView;
    }
    @RequestMapping(value = "/automxaticweaponList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateAutomxaticweapon (
            ModelAndView modelAndView,
            @Valid AutomxaticweaponEntity automxaticweaponEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            automxaticweaponService.delete(automxaticweaponEntity.getId());
            automxaticweaponService.save(automxaticweaponEntity);
            modelAndView.getModel().put("automxaticweapon", automxaticweaponEntity);
            modelAndView.setViewName("redirect:/automxaticweaponList");
        }
        return modelAndView;
    }

}

