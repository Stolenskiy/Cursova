package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.SergeantEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class SergeantViewController {
    @Autowired
    private IEntityService sergeantService;

    @GetMapping("/sergeantList")
    public String getAllSergeant (Model model) {
        model.addAttribute("sergeantList", sergeantService.getAll());
        model.addAttribute("sergeantEntity", new SergeantEntity());
        return "sergeantList.html";
    }

    @RequestMapping(value = "/sergeantList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteSergeant (
            ModelAndView modelAndView,
            @Valid SergeantEntity sergeantEntity,
            BindingResult result) {
        sergeantService.delete(sergeantEntity.getId());
        modelAndView.setViewName("redirect:/sergeantList");
        return modelAndView;
    }
    @RequestMapping(value = "/sergeantList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addSergeant (
            ModelAndView modelAndView,
            @Valid SergeantEntity sergeantEntity,
            BindingResult result) {
        sergeantService.save(sergeantEntity);
        modelAndView.setViewName("redirect:/sergeantList");
        return modelAndView;
    }
    @RequestMapping(value = "/sergeantList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateSergeant (
            ModelAndView modelAndView,
            @Valid SergeantEntity sergeantEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            sergeantService.delete(sergeantEntity.getId());
            sergeantService.save(sergeantEntity);
            modelAndView.getModel().put("sergeant", sergeantEntity);
            modelAndView.setViewName("redirect:/sergeantList");
        }
        return modelAndView;
    }

}

