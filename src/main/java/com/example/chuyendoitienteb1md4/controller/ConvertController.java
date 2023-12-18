package com.example.chuyendoitienteb1md4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/home")
    public String showForm(Model model) {
        model.addAttribute("rate", 23000);
        return "home";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam("usdAmount") double usdAmount,
                          @RequestParam("rate") double rate,
                          Model model) {
        double vndAmount = usdAmount * rate;
        model.addAttribute("usdAmount", usdAmount);
        model.addAttribute("vndAmount", vndAmount);
        model.addAttribute("rate", rate);
        return "result";
    }

}
