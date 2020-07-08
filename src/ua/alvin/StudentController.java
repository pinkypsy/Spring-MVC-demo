package ua.alvin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

@Controller
//@RequestMapping(value="student", method= RequestMethod.POST)
@RequestMapping("/student")/* The @Request-Mapping annotation, when applied
                            at the class level, specifies the kind of requests
                            that this controller handles*/
public class StudentController {
    @Value("#{countryOptions}")

    private LinkedHashMap<String,String> countryOptions;

//@RequestMapping(value = "/showForm", method= RequestMethod.GET)
//    @GetMapping("/showForm")
    @RequestMapping("/showForm")
   public String showForm(Model theModel){
        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("theCountryOptions", countryOptions);
        return "studentform";
    }
//    @RequestMapping(value = "/processedForm", method= RequestMethod.POST)
//    @GetMapping("/processedForm")
    @RequestMapping("/processedForm")
   public String processedForm(@ModelAttribute("student") Student theStudent){
//        System.out.println("Student firstName: " + theStudent.getFirstName());
//        System.out.println("Student lastName: " + theStudent.getLastName());
//        System.out.println("Student age: " + theStudent.getAge());
//        System.out.println("Student country: " + theStudent.getCountry());
        return "student-confirmation";
    }

}
