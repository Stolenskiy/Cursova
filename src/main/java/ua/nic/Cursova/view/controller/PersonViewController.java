package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.PersonEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class PersonViewController {
    @Autowired
    private IEntityService personService;

    @GetMapping("/personList")
    public String getAllPerson (Model model) {
        model.addAttribute("personList", personService.getAll());
        model.addAttribute("personEntity", new PersonEntity());
        return "personList.html";
    }

    @RequestMapping(value = "/personList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deletePerson (
            ModelAndView modelAndView,
            @Valid PersonEntity personEntity,
            BindingResult result) {
        personService.delete(personEntity.getId());
        modelAndView.setViewName("redirect:/personList");
        return modelAndView;
    }
    @RequestMapping(value = "/personList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addPerson (
            ModelAndView modelAndView,
            @Valid PersonEntity personEntity,
            BindingResult result) {
        personService.save(personEntity);
        modelAndView.setViewName("redirect:/personList");
        return modelAndView;
    }
    @RequestMapping(value = "/personList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updatePerson (
            ModelAndView modelAndView,
            @Valid PersonEntity personEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            personService.delete(personEntity.getId());
            personService.save(personEntity);
            modelAndView.getModel().put("person", personEntity);
            modelAndView.setViewName("redirect:/personList");
        }
        return modelAndView;
    }

}

