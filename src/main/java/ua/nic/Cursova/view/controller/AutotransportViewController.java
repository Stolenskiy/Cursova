package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.AutotransportEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class AutotransportViewController {
    @Autowired
    private IEntityService autotransportService;

    @GetMapping("/autotransportList")
    public String getAllAutotransport (Model model) {
        model.addAttribute("autotransportList", autotransportService.getAll());
        model.addAttribute("autotransportEntity", new AutotransportEntity());
        return "autotransportList.html";
    }

    @RequestMapping(value = "/autotransportList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteAutotransport (
            ModelAndView modelAndView,
            @Valid AutotransportEntity autotransportEntity,
            BindingResult result) {
        autotransportService.delete(autotransportEntity.getId());
        modelAndView.setViewName("redirect:/autotransportList");
        return modelAndView;
    }
    @RequestMapping(value = "/autotransportList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addAutotransport (
            ModelAndView modelAndView,
            @Valid AutotransportEntity autotransportEntity,
            BindingResult result) {
        autotransportService.save(autotransportEntity);
        modelAndView.setViewName("redirect:/autotransportList");
        return modelAndView;
    }
    @RequestMapping(value = "/autotransportList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateAutotransport (
            ModelAndView modelAndView,
            @Valid AutotransportEntity autotransportEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            autotransportService.delete(autotransportEntity.getId());
            autotransportService.save(autotransportEntity);
            modelAndView.getModel().put("autotransport", autotransportEntity);
            modelAndView.setViewName("redirect:/autotransportList");
        }
        return modelAndView;
    }

}

