package com.diego_sepog.tax_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {

    private final TaxService taxService;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @GetMapping("/calculate-tax")
    public TaxResponse calculateTax(@RequestParam double salary) {
        double tax = taxService.calculateTax(salary);
        return new TaxResponse(salary, tax);
    }
}