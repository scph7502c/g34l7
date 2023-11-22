package org.example;

class TicketSeller extends BaseEmployee {
    public TicketSeller(String firstName, String lastName, int employmentYear) {
        super(firstName, lastName, employmentYear, 3000);
    }

    @Override
    protected double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary();
    }
}