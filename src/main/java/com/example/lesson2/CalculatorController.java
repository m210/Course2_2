package com.example.lesson2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;
    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return num1 + " + " + num2 + " = " + service.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return num1 + " - " + num2 + " = " + service.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return num1 + " * " + num2 + " = " + service.multiply(num1, num2);
    }

    @GetMapping("/devide")
    public String devide(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return num1 + " / " + num2 + " = " + service.devide(num1, num2);
    }
}
