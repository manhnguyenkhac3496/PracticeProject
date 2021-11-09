package com.amela.practiveproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalController {

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("operator", "+");
        return "calculatorForm";
    }

    @PostMapping("/home")
    public String calculating(@RequestParam(name = "leftOperand") String leftOperand,
                              @RequestParam(name = "rightOperand") String rightOperand,
                              @RequestParam(name = "operator") String operator,
                              Model model) {
        double lnumber;
        double rnumber;
        double result;

        try {
            lnumber = Double.parseDouble(leftOperand);
        } catch (NumberFormatException ex) {
            lnumber = 0;
        }
        try {
            rnumber = Double.parseDouble(rightOperand);
        } catch (NumberFormatException ex) {
            rnumber = 0;
        }

        switch (operator) {
            case "+":
                result = lnumber + rnumber;
                break;
            case "-":
                result = lnumber - rnumber;
                break;
            case "*":
                result = lnumber + rnumber;
                break;
            case "/":
                result = lnumber/rnumber;
                break;
            default:
                result = 0;
        }

        model.addAttribute("leftOperand", lnumber);
        model.addAttribute("rightOperand", rnumber);
        model.addAttribute("operator", operator);
        model.addAttribute("result", result);

        return "calculatorForm";
    }
}
