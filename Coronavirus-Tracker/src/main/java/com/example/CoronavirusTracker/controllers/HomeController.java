package com.example.CoronavirusTracker.controllers;

import com.example.CoronavirusTracker.services.CoronaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CoronaDataService coronaDataService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats", coronaDataService.getAllStats());
        return "home";
    }
}
