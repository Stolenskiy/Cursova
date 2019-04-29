package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.CombatAndTransportVehiclesEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class CombatAndTransportVehiclesViewController {
    @Autowired
    private IEntityService combatAndTransportVehiclesService;

    @GetMapping("/combatAndTransportVehiclesList")
    public String getAllCombatAndTransportVehicles (Model model) {
        model.addAttribute("combatAndTransportVehiclesList", combatAndTransportVehiclesService.getAll());
        model.addAttribute("combatAndTransportVehiclesEntity", new CombatAndTransportVehiclesEntity());
        return "combatAndTransportVehiclesList.html";
    }

    @RequestMapping(value = "/combatAndTransportVehiclesList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteCombatAndTransportVehicles (
            ModelAndView modelAndView,
            @Valid CombatAndTransportVehiclesEntity combatAndTransportVehiclesEntity,
            BindingResult result) {
        combatAndTransportVehiclesService.delete(combatAndTransportVehiclesEntity.getId());
        modelAndView.setViewName("redirect:/combatAndTransportVehiclesList");
        return modelAndView;
    }
    @RequestMapping(value = "/combatAndTransportVehiclesList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addCombatAndTransportVehicles (
            ModelAndView modelAndView,
            @Valid CombatAndTransportVehiclesEntity combatAndTransportVehiclesEntity,
            BindingResult result) {
        combatAndTransportVehiclesService.save(combatAndTransportVehiclesEntity);
        modelAndView.setViewName("redirect:/combatAndTransportVehiclesList");
        return modelAndView;
    }
    @RequestMapping(value = "/combatAndTransportVehiclesList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateCombatAndTransportVehicles (
            ModelAndView modelAndView,
            @Valid CombatAndTransportVehiclesEntity combatAndTransportVehiclesEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            combatAndTransportVehiclesService.delete(combatAndTransportVehiclesEntity.getId());
            combatAndTransportVehiclesService.save(combatAndTransportVehiclesEntity);
            modelAndView.getModel().put("combatAndTransportVehicles", combatAndTransportVehiclesEntity);
            modelAndView.setViewName("redirect:/combatAndTransportVehiclesList");
        }
        return modelAndView;
    }

}

