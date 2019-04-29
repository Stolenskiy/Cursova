package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.CompositionofficersEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class CompositionofficersViewController {
    @Autowired
    private IEntityService compositionofficersService;

    @GetMapping("/compositionofficersList")
    public String getAllCompositionofficers (Model model) {
        model.addAttribute("compositionofficersList", compositionofficersService.getAll());
        model.addAttribute("compositionofficersEntity", new CompositionofficersEntity());
        return "compositionofficersList.html";
    }

    @RequestMapping(value = "/compositionofficersList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteCompositionofficers (
            ModelAndView modelAndView,
            @Valid CompositionofficersEntity compositionofficersEntity,
            BindingResult result) {
        compositionofficersService.delete(compositionofficersEntity.getId());
        modelAndView.setViewName("redirect:/compositionofficersList");
        return modelAndView;
    }
    @RequestMapping(value = "/compositionofficersList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addCompositionofficers (
            ModelAndView modelAndView,
            @Valid CompositionofficersEntity compositionofficersEntity,
            BindingResult result) {
        compositionofficersService.save(compositionofficersEntity);
        modelAndView.setViewName("redirect:/compositionofficersList");
        return modelAndView;
    }
    @RequestMapping(value = "/compositionofficersList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateCompositionofficers (
            ModelAndView modelAndView,
            @Valid CompositionofficersEntity compositionofficersEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            compositionofficersService.delete(compositionofficersEntity.getId());
            compositionofficersService.save(compositionofficersEntity);
            modelAndView.getModel().put("compositionofficers", compositionofficersEntity);
            modelAndView.setViewName("redirect:/compositionofficersList");
        }
        return modelAndView;
    }

}

