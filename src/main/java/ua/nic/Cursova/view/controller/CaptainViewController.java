package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.CaptainEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class CaptainViewController {
    @Autowired
    private IEntityService captainService;

    @GetMapping("/captainList")
    public String getAllCaptain (Model model) {
        model.addAttribute("captainList", captainService.getAll());
        model.addAttribute("captainEntity", new CaptainEntity());
        return "captainList.html";
    }

    @RequestMapping(value = "/captainList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteCaptain (
            ModelAndView modelAndView,
            @Valid CaptainEntity captainEntity,
            BindingResult result) {
        captainService.delete(captainEntity.getId());
        modelAndView.setViewName("redirect:/captainList");
        return modelAndView;
    }
    @RequestMapping(value = "/captainList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addCaptain (
            ModelAndView modelAndView,
            @Valid CaptainEntity captainEntity,
            BindingResult result) {
        captainService.save(captainEntity);
        modelAndView.setViewName("redirect:/captainList");
        return modelAndView;
    }
    @RequestMapping(value = "/captainList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateCaptain (
            ModelAndView modelAndView,
            @Valid CaptainEntity captainEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            captainService.delete(captainEntity.getId());
            captainService.save(captainEntity);
            modelAndView.getModel().put("captain", captainEntity);
            modelAndView.setViewName("redirect:/captainList");
        }
        return modelAndView;
    }

}

