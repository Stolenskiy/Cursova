package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.DivisionEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class DivisionViewController {
    @Autowired
    private IEntityService divisionService;

    @GetMapping("/divisionList")
    public String getAllDivision (Model model) {
        model.addAttribute("divisionList", divisionService.getAll());
        model.addAttribute("divisionEntity", new DivisionEntity());
        return "divisionList.html";
    }

    @RequestMapping(value = "/divisionList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteDivision (
            ModelAndView modelAndView,
            @Valid DivisionEntity divisionEntity,
            BindingResult result) {
        divisionService.delete(divisionEntity.getId());
        modelAndView.setViewName("redirect:/divisionList");
        return modelAndView;
    }
    @RequestMapping(value = "/divisionList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addDivision (
            ModelAndView modelAndView,
            @Valid DivisionEntity divisionEntity,
            BindingResult result) {
        divisionService.save(divisionEntity);
        modelAndView.setViewName("redirect:/divisionList");
        return modelAndView;
    }
    @RequestMapping(value = "/divisionList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateDivision (
            ModelAndView modelAndView,
            @Valid DivisionEntity divisionEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            divisionService.delete(divisionEntity.getId());
            divisionService.save(divisionEntity);
            modelAndView.getModel().put("division", divisionEntity);
            modelAndView.setViewName("redirect:/divisionList");
        }
        return modelAndView;
    }

}

