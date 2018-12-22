package com.example.Code.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class MyRestController {

    Logger log = Logger.getLogger(MyRestController.class.getName());

    private final String INDEX = "index";
    private final String LOGIN = "login";


    @GetMapping("/")
    public String index(){

        return INDEX;

    }

    public String login(){

        return LOGIN;
    }
}
