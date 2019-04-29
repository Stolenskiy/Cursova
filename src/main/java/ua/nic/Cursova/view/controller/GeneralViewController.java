package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.GeneralEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class GeneralViewController {
    @Autowired
    private IEntityService generalService;

    @GetMapping("/generalList")
    public String getAllGeneral (Model model) {
        model.addAttribute("generalList", generalService.getAll());
        model.addAttribute("generalEntity", new GeneralEntity());
        return "generalList.html";
    }

    @RequestMapping(value = "/generalList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteGeneral (
            ModelAndView modelAndView,
            @Valid GeneralEntity generalEntity,
            BindingResult result) {
        generalService.delete(generalEntity.getId());
        modelAndView.setViewName("redirect:/generalList");
        return modelAndView;
    }
    @RequestMapping(value = "/generalList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addGeneral (
            ModelAndView modelAndView,
            @Valid GeneralEntity generalEntity,
            BindingResult result) {
        generalService.save(generalEntity);
        modelAndView.setViewName("redirect:/generalList");
        return modelAndView;
    }
    @RequestMapping(value = "/generalList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateGeneral (
            ModelAndView modelAndView,
            @Valid GeneralEntity generalEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            generalService.delete(generalEntity.getId());
            generalService.save(generalEntity);
            modelAndView.getModel().put("general", generalEntity);
            modelAndView.setViewName("redirect:/generalList");
        }
        return modelAndView;
    }

}

