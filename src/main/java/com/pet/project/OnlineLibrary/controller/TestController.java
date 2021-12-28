package com.pet.project.OnlineLibrary.controller;

import com.pet.project.OnlineLibrary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        model.addAttribute("user", userService.findByEmail("dp260296pvm@gmail.com"));
        return "index";
    }
}
