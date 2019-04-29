package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.RocketweaponsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class RocketweaponsViewController {
    @Autowired
    private IEntityService rocketweaponsService;

    @GetMapping("/rocketweaponsList")
    public String getAllRocketweapons (Model model) {
        model.addAttribute("rocketweaponsList", rocketweaponsService.getAll());
        model.addAttribute("rocketweaponsEntity", new RocketweaponsEntity());
        return "rocketweaponsList.html";
    }

    @RequestMapping(value = "/rocketweaponsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteRocketweapons (
            ModelAndView modelAndView,
            @Valid RocketweaponsEntity rocketweaponsEntity,
            BindingResult result) {
        rocketweaponsService.delete(rocketweaponsEntity.getId());
        modelAndView.setViewName("redirect:/rocketweaponsList");
        return modelAndView;
    }
    @RequestMapping(value = "/rocketweaponsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addRocketweapons (
            ModelAndView modelAndView,
            @Valid RocketweaponsEntity rocketweaponsEntity,
            BindingResult result) {
        rocketweaponsService.save(rocketweaponsEntity);
        modelAndView.setViewName("redirect:/rocketweaponsList");
        return modelAndView;
    }
    @RequestMapping(value = "/rocketweaponsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateRocketweapons (
            ModelAndView modelAndView,
            @Valid RocketweaponsEntity rocketweaponsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            rocketweaponsService.delete(rocketweaponsEntity.getId());
            rocketweaponsService.save(rocketweaponsEntity);
            modelAndView.getModel().put("rocketweapons", rocketweaponsEntity);
            modelAndView.setViewName("redirect:/rocketweaponsList");
        }
        return modelAndView;
    }

}

