package com.practice.practice_2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // El nombre del archivo HTML de tu plantilla de login
    }
    @GetMapping("/user")
    public String userPage() {
        return "user";
    }
}
