package com.infodevelopers.basic_authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return  "/home";

    }
    @GetMapping("/home")
    public String homePage() {
        return "/home";

    }

    @GetMapping("/user")
    public String userInfo() {
        return "/user_info";
    }

    @GetMapping("/admin")
    public String adminInfo() {
        return "/admin_info";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
