package com.example.Employee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
// http://10.1.11.60:8761/employee/
    @GetMapping("/hello")
    public String firstPage() {
        return "Hello world";
    }
}
