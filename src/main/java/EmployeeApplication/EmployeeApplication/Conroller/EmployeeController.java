package EmployeeApplication.EmployeeApplication.Conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    @GetMapping("/employee")
    public String getEmployee(){
        System.out.println("This is a neweeee change");

        return "This is employee  Details";
    }
}
