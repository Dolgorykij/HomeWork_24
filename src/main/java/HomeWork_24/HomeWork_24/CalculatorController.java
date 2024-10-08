package HomeWork_24.HomeWork_24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String greeting () {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus (@RequestParam int num1, @RequestParam int num2) {
        var summation = calculatorService.plus(num1,num2);
        return num1 + " + " + num2 + " = " + summation;
    }
    @GetMapping("/minus")
    public String minus (@RequestParam int num1, @RequestParam int num2) {
        var minused = calculatorService.minus(num1,num2);
        return num1 + " - " + num2 + " = " + minused;
    }
    @GetMapping("/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2) {
        var multiplied = calculatorService.multiply(num1,num2);
        return num1 + " * " + num2 + " = " + multiplied;
    }
    @GetMapping("/divide")
    public String divide (@RequestParam int num1, @RequestParam int num2) {
        var divided = calculatorService.divide(num1,num2);
        return num1 + " / " + num2 + " = " + divided;
    }
}