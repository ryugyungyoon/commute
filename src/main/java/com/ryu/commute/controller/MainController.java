package com.ryu.commute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping("/")
    public ModelAndView mainForm(ModelAndView view){
        view.setViewName("main/main");
        return view;
    }
}
