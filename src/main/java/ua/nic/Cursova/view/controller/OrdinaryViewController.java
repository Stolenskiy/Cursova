package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.OrdinaryEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class OrdinaryViewController {
    @Autowired
    private IEntityService ordinaryService;

    @GetMapping("/ordinaryList")
    public String getAllOrdinary (Model model) {
        model.addAttribute("ordinaryList", ordinaryService.getAll());
        model.addAttribute("ordinaryEntity", new OrdinaryEntity());
        return "ordinaryList.html";
    }

    @RequestMapping(value = "/ordinaryList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteOrdinary (
            ModelAndView modelAndView,
            @Valid OrdinaryEntity ordinaryEntity,
            BindingResult result) {
        ordinaryService.delete(ordinaryEntity.getId());
        modelAndView.setViewName("redirect:/ordinaryList");
        return modelAndView;
    }
    @RequestMapping(value = "/ordinaryList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addOrdinary (
            ModelAndView modelAndView,
            @Valid OrdinaryEntity ordinaryEntity,
            BindingResult result) {
        ordinaryService.save(ordinaryEntity);
        modelAndView.setViewName("redirect:/ordinaryList");
        return modelAndView;
    }
    @RequestMapping(value = "/ordinaryList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateOrdinary (
            ModelAndView modelAndView,
            @Valid OrdinaryEntity ordinaryEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            ordinaryService.delete(ordinaryEntity.getId());
            ordinaryService.save(ordinaryEntity);
            modelAndView.getModel().put("ordinary", ordinaryEntity);
            modelAndView.setViewName("redirect:/ordinaryList");
        }
        return modelAndView;
    }

}

