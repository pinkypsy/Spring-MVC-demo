package ua.alvin;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
//@RequestMapping(value="customer", method= RequestMethod.POST)
@RequestMapping("customer")
public class CustomerController {

//    @RequestMapping(value = "/showForm", method= RequestMethod.GET)
//    @GetMapping("/showForm")
    @RequestMapping("/showForm")
   public String showForm(Model theModel){

//        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

//    @GetMapping("/processedForm")
    @RequestMapping("/processedForm")
   public String processedForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                               BindingResult theBindingResult) {
        System.out.println("Student firstName: |" + theCustomer.getFirstName() + "|");
        System.out.println("Student lastName: |" + theCustomer.getLastName() + "|");
        System.out.println(theBindingResult);

        if (theBindingResult.hasErrors()) return "customer-form";
        else return "customer-confirmation";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

}
