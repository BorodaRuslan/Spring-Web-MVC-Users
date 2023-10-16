package org.example.app.controller;

import org.example.app.entity.User;
import org.example.app.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @RequestMapping("/users")
    public String viewUsers(Model model){
        List<User> users = service.fetchAll();
        model.addAttribute("title", "Users");
        model.addAttribute("users", users);
        return "users";

    }
}
