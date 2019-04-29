package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.MilitarybaseEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class MilitarybaseViewController {
    @Autowired
    private IEntityService militarybaseService;

    @GetMapping("/militarybaseList")
    public String getAllMilitarybase (Model model) {
        model.addAttribute("militarybaseList", militarybaseService.getAll());
        model.addAttribute("militarybaseEntity", new MilitarybaseEntity());
        return "militarybaseList.html";
    }

    @RequestMapping(value = "/militarybaseList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteMilitarybase (
            ModelAndView modelAndView,
            @Valid MilitarybaseEntity militarybaseEntity,
            BindingResult result) {
        militarybaseService.delete(militarybaseEntity.getId());
        modelAndView.setViewName("redirect:/militarybaseList");
        return modelAndView;
    }
    @RequestMapping(value = "/militarybaseList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addMilitarybase (
            ModelAndView modelAndView,
            @Valid MilitarybaseEntity militarybaseEntity,
            BindingResult result) {
        militarybaseService.save(militarybaseEntity);
        modelAndView.setViewName("redirect:/militarybaseList");
        return modelAndView;
    }
    @RequestMapping(value = "/militarybaseList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateMilitarybase (
            ModelAndView modelAndView,
            @Valid MilitarybaseEntity militarybaseEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            militarybaseService.delete(militarybaseEntity.getId());
            militarybaseService.save(militarybaseEntity);
            modelAndView.getModel().put("militarybase", militarybaseEntity);
            modelAndView.setViewName("redirect:/militarybaseList");
        }
        return modelAndView;
    }

}

