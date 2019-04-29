package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.EnsignEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class EnsignViewController {
    @Autowired
    private IEntityService ensignService;

    @GetMapping("/ensignList")
    public String getAllEnsign (Model model) {
        model.addAttribute("ensignList", ensignService.getAll());
        model.addAttribute("ensignEntity", new EnsignEntity());
        return "ensignList.html";
    }

    @RequestMapping(value = "/ensignList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteEnsign (
            ModelAndView modelAndView,
            @Valid EnsignEntity ensignEntity,
            BindingResult result) {
        ensignService.delete(ensignEntity.getId());
        modelAndView.setViewName("redirect:/ensignList");
        return modelAndView;
    }
    @RequestMapping(value = "/ensignList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addEnsign (
            ModelAndView modelAndView,
            @Valid EnsignEntity ensignEntity,
            BindingResult result) {
        ensignService.save(ensignEntity);
        modelAndView.setViewName("redirect:/ensignList");
        return modelAndView;
    }
    @RequestMapping(value = "/ensignList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateEnsign (
            ModelAndView modelAndView,
            @Valid EnsignEntity ensignEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            ensignService.delete(ensignEntity.getId());
            ensignService.save(ensignEntity);
            modelAndView.getModel().put("ensign", ensignEntity);
            modelAndView.setViewName("redirect:/ensignList");
        }
        return modelAndView;
    }

}

