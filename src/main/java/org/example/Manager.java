package org.example;

class Manager extends BaseEmployee {

    private static final double managerBonus = 500;

    public Manager(String firstName, String lastName, int employmentYear) {
        super(firstName, lastName, employmentYear, 5000);
    }

    protected double getBonus() {
        return managerBonus;
    }

    @Override
    protected double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary() + getBonus();
    }
}