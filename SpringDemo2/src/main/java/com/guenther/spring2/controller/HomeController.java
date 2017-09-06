package com.guenther.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home()
    {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("message", "Hello World! ");
        return mv;
    }
    @RequestMapping("/AboutUS")
    public ModelAndView aboutUS()
    {
        ModelAndView mv = new ModelAndView("AboutUS");
        mv.addObject("message", "Information About Us! ");
        return mv;
    }



}