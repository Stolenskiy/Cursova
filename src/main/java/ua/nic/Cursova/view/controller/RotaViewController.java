package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.RotaEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class RotaViewController {
    @Autowired
    private IEntityService rotaService;

    @GetMapping("/rotaList")
    public String getAllRota (Model model) {
        model.addAttribute("rotaList", rotaService.getAll());
        model.addAttribute("rotaEntity", new RotaEntity());
        return "rotaList.html";
    }

    @RequestMapping(value = "/rotaList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteRota (
            ModelAndView modelAndView,
            @Valid RotaEntity rotaEntity,
            BindingResult result) {
        rotaService.delete(rotaEntity.getId());
        modelAndView.setViewName("redirect:/rotaList");
        return modelAndView;
    }
    @RequestMapping(value = "/rotaList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addRota (
            ModelAndView modelAndView,
            @Valid RotaEntity rotaEntity,
            BindingResult result) {
        rotaService.save(rotaEntity);
        modelAndView.setViewName("redirect:/rotaList");
        return modelAndView;
    }
    @RequestMapping(value = "/rotaList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateRota (
            ModelAndView modelAndView,
            @Valid RotaEntity rotaEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            rotaService.delete(rotaEntity.getId());
            rotaService.save(rotaEntity);
            modelAndView.getModel().put("rota", rotaEntity);
            modelAndView.setViewName("redirect:/rotaList");
        }
        return modelAndView;
    }

}

