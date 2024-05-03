package com.example.backendpr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class NewController {

    @GetMapping("/index")
    public  String hello(Model model){
        model.addAttribute("message", "Hi, Guys");
        return "index" ;
    }


}
