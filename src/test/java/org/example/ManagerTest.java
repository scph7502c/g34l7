package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    @Test

    public void testManagerMonthlySalary() {
        Manager manager = new Manager("Homer", "Simpson", 2010);
        double monthlySalary = manager.calculateMonthlySalary();
        assertEquals(5500, monthlySalary);
    }

    @Test

    public void testManagerYearsOfService() {
        Manager manager = new Manager("Homer", "Simpson", 2010);
        int yearsOfService = manager.yearsOfService();
        assertEquals(13, yearsOfService);
    }

}