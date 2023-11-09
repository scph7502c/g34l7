package org.example;

class Manager extends BaseEmployee {
    private static final double managerBaseSalary = 5000;
    private static final double managerBonus = 500;

    public Manager(String firstName, String lastName, int employmentYear) {
        super(firstName, lastName, employmentYear);
    }

    @Override
    protected double getBaseSalary() {
        return managerBaseSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary() + managerBonus;
    }
}