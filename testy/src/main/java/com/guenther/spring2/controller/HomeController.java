package com.guenther.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView welcome()
    {
        ModelAndView mv = new ModelAndView("/order");
        mv.addObject("salutation", "Welcome, new customer !");
        return mv;
    }

    @RequestMapping("/response")
    public ModelAndView formhandler (
            @RequestParam("ItemNumber") int itemnumber

    ) {

        //here's where the magic happens
        ModelAndView mv = new ModelAndView("/response");
        mv.addObject("ItemNumber", itemnumber);
        return mv;
    }
}