package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.YefreytorEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class YefreytorViewController {
    @Autowired
    private IEntityService yefreytorService;

    @GetMapping("/yefreytorList")
    public String getAllYefreytor (Model model) {
        model.addAttribute("yefreytorList", yefreytorService.getAll());
        model.addAttribute("yefreytorEntity", new YefreytorEntity());
        return "yefreytorList.html";
    }

    @RequestMapping(value = "/yefreytorList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteYefreytor (
            ModelAndView modelAndView,
            @Valid YefreytorEntity yefreytorEntity,
            BindingResult result) {
        yefreytorService.delete(yefreytorEntity.getId());
        modelAndView.setViewName("redirect:/yefreytorList");
        return modelAndView;
    }
    @RequestMapping(value = "/yefreytorList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addYefreytor (
            ModelAndView modelAndView,
            @Valid YefreytorEntity yefreytorEntity,
            BindingResult result) {
        yefreytorService.save(yefreytorEntity);
        modelAndView.setViewName("redirect:/yefreytorList");
        return modelAndView;
    }
    @RequestMapping(value = "/yefreytorList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateYefreytor (
            ModelAndView modelAndView,
            @Valid YefreytorEntity yefreytorEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            yefreytorService.delete(yefreytorEntity.getId());
            yefreytorService.save(yefreytorEntity);
            modelAndView.getModel().put("yefreytor", yefreytorEntity);
            modelAndView.setViewName("redirect:/yefreytorList");
        }
        return modelAndView;
    }

}

