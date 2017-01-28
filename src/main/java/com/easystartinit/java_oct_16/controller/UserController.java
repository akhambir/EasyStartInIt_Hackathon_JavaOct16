package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/login")
    public String getLoginPage(@RequestParam(value = "error", required = false) String error,
                               @RequestParam(value = "logout", required = false) String logout, Model model) {

        if(error != null) {
            error = "Wrong login or password";
            model.addAttribute("error", error);
        }

        if(logout != null) {
            logout = "You have been logout successfully";
            model.addAttribute("logout", logout);
        }

        return "loginPage";
    }
}
