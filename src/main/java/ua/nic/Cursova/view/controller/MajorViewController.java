package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.MajorEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class MajorViewController {
    @Autowired
    private IEntityService majorService;

    @GetMapping("/majorList")
    public String getAllMajor (Model model) {
        model.addAttribute("majorList", majorService.getAll());
        model.addAttribute("majorEntity", new MajorEntity());
        return "majorList.html";
    }

    @RequestMapping(value = "/majorList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteMajor (
            ModelAndView modelAndView,
            @Valid MajorEntity majorEntity,
            BindingResult result) {
        majorService.delete(majorEntity.getId());
        modelAndView.setViewName("redirect:/majorList");
        return modelAndView;
    }
    @RequestMapping(value = "/majorList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addMajor (
            ModelAndView modelAndView,
            @Valid MajorEntity majorEntity,
            BindingResult result) {
        majorService.save(majorEntity);
        modelAndView.setViewName("redirect:/majorList");
        return modelAndView;
    }
    @RequestMapping(value = "/majorList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateMajor (
            ModelAndView modelAndView,
            @Valid MajorEntity majorEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            majorService.delete(majorEntity.getId());
            majorService.save(majorEntity);
            modelAndView.getModel().put("major", majorEntity);
            modelAndView.setViewName("redirect:/majorList");
        }
        return modelAndView;
    }

}

