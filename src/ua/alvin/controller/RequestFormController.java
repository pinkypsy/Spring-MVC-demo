package ua.alvin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class RequestFormController {

    @RequestMapping("/reqform")
    public String requestForm(){return "reqform";}

    @RequestMapping("/respform")
    public String responseForm(){return "respform";}


    @RequestMapping("/respform2")
    public String shoutDude(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");

        String theTransformedString = "Yo, " + theName.toUpperCase() + "!!!";

        model.addAttribute("message",theTransformedString);

        return "respform2";
    }

    @RequestMapping("/respform3")
    public String shoutDude3(@RequestParam("studentName") String theName, Model model){


        String theTransformedString = "Yo, " + theName.toUpperCase() + "!!! It's shoutDude3()";

        model.addAttribute("message",theTransformedString);

        return "respform2";
    }


}
