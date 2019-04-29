package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.BrigadeEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class BrigadeViewController {
    @Autowired
    private IEntityService brigadeService;

    @GetMapping("/brigadeList")
    public String getAllBrigade (Model model) {
        model.addAttribute("brigadeList", brigadeService.getAll());
        model.addAttribute("brigadeEntity", new BrigadeEntity());
        return "brigadeList.html";
    }

    @RequestMapping(value = "/brigadeList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteBrigade (
            ModelAndView modelAndView,
            @Valid BrigadeEntity brigadeEntity,
            BindingResult result) {
        brigadeService.delete(brigadeEntity.getId());
        modelAndView.setViewName("redirect:/brigadeList");
        return modelAndView;
    }
    @RequestMapping(value = "/brigadeList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addBrigade (
            ModelAndView modelAndView,
            @Valid BrigadeEntity brigadeEntity,
            BindingResult result) {
        brigadeService.save(brigadeEntity);
        modelAndView.setViewName("redirect:/brigadeList");
        return modelAndView;
    }
    @RequestMapping(value = "/brigadeList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateBrigade (
            ModelAndView modelAndView,
            @Valid BrigadeEntity brigadeEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            brigadeService.delete(brigadeEntity.getId());
            brigadeService.save(brigadeEntity);
            modelAndView.getModel().put("brigade", brigadeEntity);
            modelAndView.setViewName("redirect:/brigadeList");
        }
        return modelAndView;
    }

}

