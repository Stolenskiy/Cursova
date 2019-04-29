package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.ArmyEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class ArmyViewController {
    @Autowired
    private IEntityService armyService;

    @GetMapping("/armyList")
    public String getAllArmy (Model model) {
        model.addAttribute("armyList", armyService.getAll());
        model.addAttribute("armyEntity", new ArmyEntity());
        return "armyList.html";
    }

    @RequestMapping(value = "/armyList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteArmy (
            ModelAndView modelAndView,
            @Valid ArmyEntity armyEntity,
            BindingResult result) {
        armyService.delete(armyEntity.getId());
        modelAndView.setViewName("redirect:/armyList");
        return modelAndView;
    }
    @RequestMapping(value = "/armyList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addArmy (
            ModelAndView modelAndView,
            @Valid ArmyEntity armyEntity,
            BindingResult result) {
        armyService.save(armyEntity);
        modelAndView.setViewName("redirect:/armyList");
        return modelAndView;
    }
    @RequestMapping(value = "/armyList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateArmy (
            ModelAndView modelAndView,
            @Valid ArmyEntity armyEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            armyService.delete(armyEntity.getId());
            armyService.save(armyEntity);
            modelAndView.getModel().put("army", armyEntity);
            modelAndView.setViewName("redirect:/armyList");
        }
        return modelAndView;
    }

}

