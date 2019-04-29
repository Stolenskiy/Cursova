package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.RankandfileEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class RankandfileViewController {
    @Autowired
    private IEntityService rankandfileService;

    @GetMapping("/rankandfileList")
    public String getAllRankandfile (Model model) {
        model.addAttribute("rankandfileList", rankandfileService.getAll());
        model.addAttribute("rankandfileEntity", new RankandfileEntity());
        return "rankandfileList.html";
    }

    @RequestMapping(value = "/rankandfileList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteRankandfile (
            ModelAndView modelAndView,
            @Valid RankandfileEntity rankandfileEntity,
            BindingResult result) {
        rankandfileService.delete(rankandfileEntity.getId());
        modelAndView.setViewName("redirect:/rankandfileList");
        return modelAndView;
    }
    @RequestMapping(value = "/rankandfileList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addRankandfile (
            ModelAndView modelAndView,
            @Valid RankandfileEntity rankandfileEntity,
            BindingResult result) {
        rankandfileService.save(rankandfileEntity);
        modelAndView.setViewName("redirect:/rankandfileList");
        return modelAndView;
    }
    @RequestMapping(value = "/rankandfileList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateRankandfile (
            ModelAndView modelAndView,
            @Valid RankandfileEntity rankandfileEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            rankandfileService.delete(rankandfileEntity.getId());
            rankandfileService.save(rankandfileEntity);
            modelAndView.getModel().put("rankandfile", rankandfileEntity);
            modelAndView.setViewName("redirect:/rankandfileList");
        }
        return modelAndView;
    }

}

