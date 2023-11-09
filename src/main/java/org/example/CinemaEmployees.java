package org.example;

import java.util.Calendar;

abstract class BaseEmployee {
    private String firstName;
    private String lastName;
    protected final int employmentYear;
    protected final double defaultBaseSalary;

    public BaseEmployee(String firstName, String lastName, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentYear = employmentYear;
        this.defaultBaseSalary = 3000;
    }

    public final int yearsOfService() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - employmentYear;
    }

    protected abstract double getBaseSalary();

    public abstract double calculateMonthlySalary();
}