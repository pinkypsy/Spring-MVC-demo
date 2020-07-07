package ua.alvin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

@Controller
@RequestMapping(value="student", method= RequestMethod.POST)

public class StudentController {
    @Value("#{countryOptions}")

    private LinkedHashMap<String,String> countryOptions;

    @GetMapping("/showForm")
   public String showForm(Model theModel){
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("theCountryOptions", countryOptions);
        return "studentform";
    }

    @GetMapping("/processedForm")
   public String processedForm(@ModelAttribute("student") Student theStudent){

        System.out.println("Student firstName: " + theStudent.getFirstName());
        System.out.println("Student lastName: " + theStudent.getLastName());
        System.out.println("Student age: " + theStudent.getAge());
        System.out.println("Student country: " + theStudent.getCountry());
        return "student-confirmation";
    }

}
