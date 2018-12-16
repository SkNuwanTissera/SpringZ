package com.example.demo.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("username","Nuwan Tissera");
        model.addAttribute("mode","Y");
        return "index";
    }
}
