package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.ArtilleryEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class ArtilleryViewController {
    @Autowired
    private IEntityService artilleryService;

    @GetMapping("/artilleryList")
    public String getAllArtillery (Model model) {
        model.addAttribute("artilleryList", artilleryService.getAll());
        model.addAttribute("artilleryEntity", new ArtilleryEntity());
        return "artilleryList.html";
    }

    @RequestMapping(value = "/artilleryList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteArtillery (
            ModelAndView modelAndView,
            @Valid ArtilleryEntity artilleryEntity,
            BindingResult result) {
        artilleryService.delete(artilleryEntity.getId());
        modelAndView.setViewName("redirect:/artilleryList");
        return modelAndView;
    }
    @RequestMapping(value = "/artilleryList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addArtillery (
            ModelAndView modelAndView,
            @Valid ArtilleryEntity artilleryEntity,
            BindingResult result) {
        artilleryService.save(artilleryEntity);
        modelAndView.setViewName("redirect:/artilleryList");
        return modelAndView;
    }
    @RequestMapping(value = "/artilleryList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateArtillery (
            ModelAndView modelAndView,
            @Valid ArtilleryEntity artilleryEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            artilleryService.delete(artilleryEntity.getId());
            artilleryService.save(artilleryEntity);
            modelAndView.getModel().put("artillery", artilleryEntity);
            modelAndView.setViewName("redirect:/artilleryList");
        }
        return modelAndView;
    }

}

