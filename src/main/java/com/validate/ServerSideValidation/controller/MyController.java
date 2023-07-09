package com.validate.ServerSideValidation.controller;

import com.validate.ServerSideValidation.controller.model.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model){
        System.out.println("opening form");
        model.addAttribute("loginData", new LoginData());
        return "form";
    }
}
