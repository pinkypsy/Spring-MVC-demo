package ua.alvin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.alvin.entity.Customer;
import ua.alvin.service.CustomerService;

import javax.validation.Valid;
import java.util.List;

@Controller
//@RequestMapping(value="customer", method= RequestMethod.POST)
@RequestMapping("customer")
public class CustomerFormController {

    @Autowired
    private CustomerService customerService;

    //    @RequestMapping(value = "/showForm", method= RequestMethod.GET)
//    @GetMapping("/showForm")
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processedForm")
    public String processedForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                                BindingResult theBindingResult) {
        System.out.println("Customer firstName: |" + theCustomer.getFirstName() + "|");
        System.out.println("Customer lastName: |" + theCustomer.getLastName() + "|");
        System.out.println(theBindingResult);

        if (theBindingResult.hasErrors()) return "customer-form";
        else {
            //save customer to DB
            customerService.saveCustomer(theCustomer);
            return "customer-confirmation";
        }
    }

    @RequestMapping("/showCustomerList")
    public String showCustomers(Model model) {

        List<Customer> customers = customerService.getCustomers();

        model.addAttribute("customers", customers);

        return "showCustomerList";
    }

    @RequestMapping("/showFormUpdateCustomer")
    public String showFormUpdateCustomer(@RequestParam("customerId") int theId,
                                         Model model) {

        Customer theCustomer = customerService.getCustomer(theId);

        model.addAttribute("customer", theCustomer);

        return "customer-form";
    }

    @RequestMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId,
                                 Model model) {

        Customer theCustomer = customerService.getCustomer(theId);

        model.addAttribute("customer", theCustomer);

        customerService.delete(theCustomer);

        return "redirect:/customer/showCustomerList";
    }


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

}
