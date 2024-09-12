package com.diego_sepog.tax_calculator;

public class TaxResponse {

    private double salary;
    private double tax;

    public TaxResponse(double salary, double tax) {
        this.salary = salary;
        this.tax = tax;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        return tax;
    }
}