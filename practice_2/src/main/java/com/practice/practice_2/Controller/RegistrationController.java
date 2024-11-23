package com.practice.practice_2.Controller;

import com.practice.practice_2.Entity.User;
import com.practice.practice_2.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    // Show the registration form and pass an empty User object to the view
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User()); // Add the User object to the model
        return "register"; // The name of your Thymeleaf template (register.html)
    }

    // Handle the form submission and save the user
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userService.save(user); // Save the user, ensure the password is properly hashed
        return "redirect:/login"; // Redirect to the login page after registration
    }
}
