package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.TractorEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class TractorViewController {
    @Autowired
    private IEntityService tractorService;

    @GetMapping("/tractorList")
    public String getAllTractor (Model model) {
        model.addAttribute("tractorList", tractorService.getAll());
        model.addAttribute("tractorEntity", new TractorEntity());
        return "tractorList.html";
    }

    @RequestMapping(value = "/tractorList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteTractor (
            ModelAndView modelAndView,
            @Valid TractorEntity tractorEntity,
            BindingResult result) {
        tractorService.delete(tractorEntity.getId());
        modelAndView.setViewName("redirect:/tractorList");
        return modelAndView;
    }
    @RequestMapping(value = "/tractorList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addTractor (
            ModelAndView modelAndView,
            @Valid TractorEntity tractorEntity,
            BindingResult result) {
        tractorService.save(tractorEntity);
        modelAndView.setViewName("redirect:/tractorList");
        return modelAndView;
    }
    @RequestMapping(value = "/tractorList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateTractor (
            ModelAndView modelAndView,
            @Valid TractorEntity tractorEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            tractorService.delete(tractorEntity.getId());
            tractorService.save(tractorEntity);
            modelAndView.getModel().put("tractor", tractorEntity);
            modelAndView.setViewName("redirect:/tractorList");
        }
        return modelAndView;
    }

}

