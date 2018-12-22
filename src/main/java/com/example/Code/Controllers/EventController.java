package com.example.Code.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@Controller
public class EventController {

    private final String SEVENT = "see_event";
    private final String AEVENT = "add_event";
    private final String EEVENT = "edit_event";
    private final String DEVENT = "delete_event";


    @GetMapping()
    public String seeEvent(){

        return "";
    }

    @PostMapping
    public String addEvent(){

        return "";
    }

    @PutMapping()
    public String editEvent(){

        return "";
    }

    @DeleteMapping
    public  String deleteEvent(){

        return  "";
    }
}
