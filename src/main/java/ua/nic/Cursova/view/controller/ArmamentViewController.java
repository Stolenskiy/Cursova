package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.ArmamentEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class ArmamentViewController {
    @Autowired
    private IEntityService armamentService;

    @GetMapping("/armamentList")
    public String getAllArmament (Model model) {
        model.addAttribute("armamentList", armamentService.getAll());
        model.addAttribute("armamentEntity", new ArmamentEntity());
        return "armamentList.html";
    }

    @RequestMapping(value = "/armamentList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteArmament (
            ModelAndView modelAndView,
            @Valid ArmamentEntity armamentEntity,
            BindingResult result) {
        armamentService.delete(armamentEntity.getId());
        modelAndView.setViewName("redirect:/armamentList");
        return modelAndView;
    }
    @RequestMapping(value = "/armamentList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addArmament (
            ModelAndView modelAndView,
            @Valid ArmamentEntity armamentEntity,
            BindingResult result) {
        armamentService.save(armamentEntity);
        modelAndView.setViewName("redirect:/armamentList");
        return modelAndView;
    }
    @RequestMapping(value = "/armamentList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateArmament (
            ModelAndView modelAndView,
            @Valid ArmamentEntity armamentEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            armamentService.delete(armamentEntity.getId());
            armamentService.save(armamentEntity);
            modelAndView.getModel().put("armament", armamentEntity);
            modelAndView.setViewName("redirect:/armamentList");
        }
        return modelAndView;
    }

}

