package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.BalisticmissileEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class BalisticmissileViewController {
    @Autowired
    private IEntityService balisticmissileService;

    @GetMapping("/balisticmissileList")
    public String getAllBalisticmissile (Model model) {
        model.addAttribute("balisticmissileList", balisticmissileService.getAll());
        model.addAttribute("balisticmissileEntity", new BalisticmissileEntity());
        return "balisticmissileList.html";
    }

    @RequestMapping(value = "/balisticmissileList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteBalisticmissile (
            ModelAndView modelAndView,
            @Valid BalisticmissileEntity balisticmissileEntity,
            BindingResult result) {
        balisticmissileService.delete(balisticmissileEntity.getId());
        modelAndView.setViewName("redirect:/balisticmissileList");
        return modelAndView;
    }
    @RequestMapping(value = "/balisticmissileList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addBalisticmissile (
            ModelAndView modelAndView,
            @Valid BalisticmissileEntity balisticmissileEntity,
            BindingResult result) {
        balisticmissileService.save(balisticmissileEntity);
        modelAndView.setViewName("redirect:/balisticmissileList");
        return modelAndView;
    }
    @RequestMapping(value = "/balisticmissileList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateBalisticmissile (
            ModelAndView modelAndView,
            @Valid BalisticmissileEntity balisticmissileEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            balisticmissileService.delete(balisticmissileEntity.getId());
            balisticmissileService.save(balisticmissileEntity);
            modelAndView.getModel().put("balisticmissile", balisticmissileEntity);
            modelAndView.setViewName("redirect:/balisticmissileList");
        }
        return modelAndView;
    }

}

