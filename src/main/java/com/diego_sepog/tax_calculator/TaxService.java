package com.diego_sepog.tax_calculator;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double calculateTax(double salary) {
        double tax;

        if (salary <= 2000) {
            tax = 0;
        } else if (salary <= 5000) {
            tax = salary * 0.1;
        } else {
            tax = salary * 0.2;
        }

        return tax;
    }
}