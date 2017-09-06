package com.guenther.spring2.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
@Controller
public class HomeController {

    @RequestMapping ("/astrology")
    public ModelAndView astrology () {
        try {



        }
        return new ModelAndView("astrology");
    }

    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message","Welcome to Grand Circus Coffee Shop!!!");
        mv.addObject("bob", "This is another string");
        mv.addObject("title", "Welcome to Grand Circus Coffee Shop!!!");
        return mv;
    }

    @RequestMapping("/userform")
    public ModelAndView userform () {
        return new ModelAndView("form", "inst",
                "Please enter info: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler (
            @RequestParam("name") String name,
            @RequestParam("email") String email
    ) {

        //here's where the magic happens

        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("name", name);
        mv.addObject("email", email);
        return mv;
    }
}