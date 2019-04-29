package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.MilitaryspecialtyEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class MilitaryspecialtyViewController {
    @Autowired
    private IEntityService militaryspecialtyService;

    @GetMapping("/militaryspecialtyList")
    public String getAllMilitaryspecialty (Model model) {
        model.addAttribute("militaryspecialtyList", militaryspecialtyService.getAll());
        model.addAttribute("militaryspecialtyEntity", new MilitaryspecialtyEntity());
        return "militaryspecialtyList.html";
    }

    @RequestMapping(value = "/militaryspecialtyList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteMilitaryspecialty (
            ModelAndView modelAndView,
            @Valid MilitaryspecialtyEntity militaryspecialtyEntity,
            BindingResult result) {
        militaryspecialtyService.delete(militaryspecialtyEntity.getId());
        modelAndView.setViewName("redirect:/militaryspecialtyList");
        return modelAndView;
    }
    @RequestMapping(value = "/militaryspecialtyList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addMilitaryspecialty (
            ModelAndView modelAndView,
            @Valid MilitaryspecialtyEntity militaryspecialtyEntity,
            BindingResult result) {
        militaryspecialtyService.save(militaryspecialtyEntity);
        modelAndView.setViewName("redirect:/militaryspecialtyList");
        return modelAndView;
    }
    @RequestMapping(value = "/militaryspecialtyList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateMilitaryspecialty (
            ModelAndView modelAndView,
            @Valid MilitaryspecialtyEntity militaryspecialtyEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            militaryspecialtyService.delete(militaryspecialtyEntity.getId());
            militaryspecialtyService.save(militaryspecialtyEntity);
            modelAndView.getModel().put("militaryspecialty", militaryspecialtyEntity);
            modelAndView.setViewName("redirect:/militaryspecialtyList");
        }
        return modelAndView;
    }

}

