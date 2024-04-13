package com.mediator.mediatorpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mediator.mediatorpattern.mediatorPattern.UserMediator;
import com.mediator.mediatorpattern.model.User;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMediator userMediator;

    @GetMapping("/addUserPage")
    public String addUserPage(Model model) {
        model.addAttribute("user", new User());
        return "addUser"; // Nama file Thymeleaf tanpa ekstensi
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user) {
        userMediator.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        List<User> users = userMediator.getAllUsers();
        model.addAttribute("users", users);
        return "userList"; // Nama file Thymeleaf tanpa ekstensi
    }
}
