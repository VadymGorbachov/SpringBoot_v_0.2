package com.gmail.vadym.gorbachov.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        System.out.println("index");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name", "Hello");
        return  modelAndView;
    }
}
