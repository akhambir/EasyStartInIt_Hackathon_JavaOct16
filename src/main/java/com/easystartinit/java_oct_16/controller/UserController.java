package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.model.User;
import com.easystartinit.java_oct_16.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
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

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistrationPage(Model model) {
        model.addAttribute("newUser", new User());
        return "registrationPage";
    }

    @RequestMapping(value = "/registration/addUser", method = RequestMethod.POST)
    public String addNewUser(@ModelAttribute User user, Model model) {
        model.addAttribute("newUser", userService.addUser(user));
        return "homePage";
    }

   /* @RequestMapping(value = "/userpage", method = RequestMethod.GET)
    public String getUserPage(@ModelAttribute User user, Model model) {
        UserBucket bucket = userService.getBucketByUserName(user);
        model.addAttribute("price", userService.getTotalPrice(bucket.getProducts()));
        model.addAttribute("products", bucket.getProducts());
        return "userPage";
    }*/
}
