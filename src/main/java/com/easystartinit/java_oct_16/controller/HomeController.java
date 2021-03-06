package com.easystartinit.java_oct_16.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(){
        return "homePage";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String getContact(){
        return "contacts";
    }
}
