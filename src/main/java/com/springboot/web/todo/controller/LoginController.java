package com.springboot.web.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public static String homePage() {
        return "Default home page";
    }

    @RequestMapping("/index")
    @ResponseBody
    public static String indexPage() {
        return "Default index page test";
    }

    @RequestMapping("/login")
    public String loginPage(@RequestParam String name, ModelMap model) {
        System.out.println(" username: "+name);
        model.put("username", name);
        return "login";
    }
}
