package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.DepartmentEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class DepartmentViewController {
    @Autowired
    private IEntityService departmentService;

    @GetMapping("/departmentList")
    public String getAllDepartment (Model model) {
        model.addAttribute("departmentList", departmentService.getAll());
        model.addAttribute("departmentEntity", new DepartmentEntity());
        return "departmentList.html";
    }

    @RequestMapping(value = "/departmentList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteDepartment (
            ModelAndView modelAndView,
            @Valid DepartmentEntity departmentEntity,
            BindingResult result) {
        departmentService.delete(departmentEntity.getId());
        modelAndView.setViewName("redirect:/departmentList");
        return modelAndView;
    }
    @RequestMapping(value = "/departmentList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addDepartment (
            ModelAndView modelAndView,
            @Valid DepartmentEntity departmentEntity,
            BindingResult result) {
        departmentService.save(departmentEntity);
        modelAndView.setViewName("redirect:/departmentList");
        return modelAndView;
    }
    @RequestMapping(value = "/departmentList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateDepartment (
            ModelAndView modelAndView,
            @Valid DepartmentEntity departmentEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            departmentService.delete(departmentEntity.getId());
            departmentService.save(departmentEntity);
            modelAndView.getModel().put("department", departmentEntity);
            modelAndView.setViewName("redirect:/departmentList");
        }
        return modelAndView;
    }

}

