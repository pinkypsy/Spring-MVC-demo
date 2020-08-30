package ua.alvin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnotherController {

    @RequestMapping("/reqform")
    public String requestForm1(){return "reqform";}

}
