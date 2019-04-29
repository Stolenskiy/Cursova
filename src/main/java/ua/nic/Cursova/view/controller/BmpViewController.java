package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.BmpEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class BmpViewController {
    @Autowired
    private IEntityService bmpService;

    @GetMapping("/bmpList")
    public String getAllBmp (Model model) {
        model.addAttribute("bmpList", bmpService.getAll());
        model.addAttribute("bmpEntity", new BmpEntity());
        return "bmpList.html";
    }

    @RequestMapping(value = "/bmpList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteBmp (
            ModelAndView modelAndView,
            @Valid BmpEntity bmpEntity,
            BindingResult result) {
        bmpService.delete(bmpEntity.getId());
        modelAndView.setViewName("redirect:/bmpList");
        return modelAndView;
    }
    @RequestMapping(value = "/bmpList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addBmp (
            ModelAndView modelAndView,
            @Valid BmpEntity bmpEntity,
            BindingResult result) {
        bmpService.save(bmpEntity);
        modelAndView.setViewName("redirect:/bmpList");
        return modelAndView;
    }
    @RequestMapping(value = "/bmpList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateBmp (
            ModelAndView modelAndView,
            @Valid BmpEntity bmpEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            bmpService.delete(bmpEntity.getId());
            bmpService.save(bmpEntity);
            modelAndView.getModel().put("bmp", bmpEntity);
            modelAndView.setViewName("redirect:/bmpList");
        }
        return modelAndView;
    }

}

