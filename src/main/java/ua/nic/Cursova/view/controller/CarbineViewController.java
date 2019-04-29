package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.CarbineEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class CarbineViewController {
    @Autowired
    private IEntityService carbineService;

    @GetMapping("/carbineList")
    public String getAllCarbine (Model model) {
        model.addAttribute("carbineList", carbineService.getAll());
        model.addAttribute("carbineEntity", new CarbineEntity());
        return "carbineList.html";
    }

    @RequestMapping(value = "/carbineList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteCarbine (
            ModelAndView modelAndView,
            @Valid CarbineEntity carbineEntity,
            BindingResult result) {
        carbineService.delete(carbineEntity.getId());
        modelAndView.setViewName("redirect:/carbineList");
        return modelAndView;
    }
    @RequestMapping(value = "/carbineList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addCarbine (
            ModelAndView modelAndView,
            @Valid CarbineEntity carbineEntity,
            BindingResult result) {
        carbineService.save(carbineEntity);
        modelAndView.setViewName("redirect:/carbineList");
        return modelAndView;
    }
    @RequestMapping(value = "/carbineList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateCarbine (
            ModelAndView modelAndView,
            @Valid CarbineEntity carbineEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            carbineService.delete(carbineEntity.getId());
            carbineService.save(carbineEntity);
            modelAndView.getModel().put("carbine", carbineEntity);
            modelAndView.setViewName("redirect:/carbineList");
        }
        return modelAndView;
    }

}

