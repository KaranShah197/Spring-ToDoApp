package com.springboot.web.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String loginPage() {
        return "login";
    }
}
