package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.LieutenantEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class LieutenantViewController {
    @Autowired
    private IEntityService lieutenantService;

    @GetMapping("/lieutenantList")
    public String getAllLieutenant (Model model) {
        model.addAttribute("lieutenantList", lieutenantService.getAll());
        model.addAttribute("lieutenantEntity", new LieutenantEntity());
        return "lieutenantList.html";
    }

    @RequestMapping(value = "/lieutenantList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteLieutenant (
            ModelAndView modelAndView,
            @Valid LieutenantEntity lieutenantEntity,
            BindingResult result) {
        lieutenantService.delete(lieutenantEntity.getId());
        modelAndView.setViewName("redirect:/lieutenantList");
        return modelAndView;
    }
    @RequestMapping(value = "/lieutenantList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addLieutenant (
            ModelAndView modelAndView,
            @Valid LieutenantEntity lieutenantEntity,
            BindingResult result) {
        lieutenantService.save(lieutenantEntity);
        modelAndView.setViewName("redirect:/lieutenantList");
        return modelAndView;
    }
    @RequestMapping(value = "/lieutenantList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateLieutenant (
            ModelAndView modelAndView,
            @Valid LieutenantEntity lieutenantEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            lieutenantService.delete(lieutenantEntity.getId());
            lieutenantService.save(lieutenantEntity);
            modelAndView.getModel().put("lieutenant", lieutenantEntity);
            modelAndView.setViewName("redirect:/lieutenantList");
        }
        return modelAndView;
    }

}

