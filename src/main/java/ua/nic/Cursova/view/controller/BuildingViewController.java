package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.BuildingEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class BuildingViewController {
    @Autowired
    private IEntityService buildingService;

    @GetMapping("/buildingList")
    public String getAllBuilding (Model model) {
        model.addAttribute("buildingList", buildingService.getAll());
        model.addAttribute("buildingEntity", new BuildingEntity());
        return "buildingList.html";
    }

    @RequestMapping(value = "/buildingList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteBuilding (
            ModelAndView modelAndView,
            @Valid BuildingEntity buildingEntity,
            BindingResult result) {
        buildingService.delete(buildingEntity.getId());
        modelAndView.setViewName("redirect:/buildingList");
        return modelAndView;
    }
    @RequestMapping(value = "/buildingList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addBuilding (
            ModelAndView modelAndView,
            @Valid BuildingEntity buildingEntity,
            BindingResult result) {
        buildingService.save(buildingEntity);
        modelAndView.setViewName("redirect:/buildingList");
        return modelAndView;
    }
    @RequestMapping(value = "/buildingList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateBuilding (
            ModelAndView modelAndView,
            @Valid BuildingEntity buildingEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            buildingService.delete(buildingEntity.getId());
            buildingService.save(buildingEntity);
            modelAndView.getModel().put("building", buildingEntity);
            modelAndView.setViewName("redirect:/buildingList");
        }
        return modelAndView;
    }

}

