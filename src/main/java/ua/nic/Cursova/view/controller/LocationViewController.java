package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.LocationEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class LocationViewController {
    @Autowired
    private IEntityService locationService;

    @GetMapping("/locationList")
    public String getAllLocation (Model model) {
        model.addAttribute("locationList", locationService.getAll());
        model.addAttribute("locationEntity", new LocationEntity());
        return "locationList.html";
    }

    @RequestMapping(value = "/locationList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteLocation (
            ModelAndView modelAndView,
            @Valid LocationEntity locationEntity,
            BindingResult result) {
        locationService.delete(locationEntity.getId());
        modelAndView.setViewName("redirect:/locationList");
        return modelAndView;
    }
    @RequestMapping(value = "/locationList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addLocation (
            ModelAndView modelAndView,
            @Valid LocationEntity locationEntity,
            BindingResult result) {
        locationService.save(locationEntity);
        modelAndView.setViewName("redirect:/locationList");
        return modelAndView;
    }
    @RequestMapping(value = "/locationList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateLocation (
            ModelAndView modelAndView,
            @Valid LocationEntity locationEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            locationService.delete(locationEntity.getId());
            locationService.save(locationEntity);
            modelAndView.getModel().put("location", locationEntity);
            modelAndView.setViewName("redirect:/locationList");
        }
        return modelAndView;
    }

}

