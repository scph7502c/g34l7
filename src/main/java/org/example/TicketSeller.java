package org.example;

class TicketSeller extends BaseEmployee {
    public TicketSeller(String firstName, String lastName, int employmentYear) {
        super(firstName, lastName, employmentYear);
    }

    @Override
    protected double getBaseSalary() {
        return defaultBaseSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary();
    }
}