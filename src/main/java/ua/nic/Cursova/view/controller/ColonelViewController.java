package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.ColonelEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class ColonelViewController {
    @Autowired
    private IEntityService colonelService;

    @GetMapping("/colonelList")
    public String getAllColonel (Model model) {
        model.addAttribute("colonelList", colonelService.getAll());
        model.addAttribute("colonelEntity", new ColonelEntity());
        return "colonelList.html";
    }

    @RequestMapping(value = "/colonelList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteColonel (
            ModelAndView modelAndView,
            @Valid ColonelEntity colonelEntity,
            BindingResult result) {
        colonelService.delete(colonelEntity.getId());
        modelAndView.setViewName("redirect:/colonelList");
        return modelAndView;
    }
    @RequestMapping(value = "/colonelList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addColonel (
            ModelAndView modelAndView,
            @Valid ColonelEntity colonelEntity,
            BindingResult result) {
        colonelService.save(colonelEntity);
        modelAndView.setViewName("redirect:/colonelList");
        return modelAndView;
    }
    @RequestMapping(value = "/colonelList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateColonel (
            ModelAndView modelAndView,
            @Valid ColonelEntity colonelEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            colonelService.delete(colonelEntity.getId());
            colonelService.save(colonelEntity);
            modelAndView.getModel().put("colonel", colonelEntity);
            modelAndView.setViewName("redirect:/colonelList");
        }
        return modelAndView;
    }

}

