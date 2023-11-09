package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketSellerTest {

    @Test

    //test ticket seller monthly salary

    public void testTicketSellerMonthlySalary() {
        TicketSeller ticketSeller = new TicketSeller("Bart", "Simpson", 200);
        double monthlySalary = ticketSeller.calculateMonthlySalary();
        assertEquals(3000, monthlySalary);
    }

    @Test

    //test ticket seller years of service
    public void testTicketSellerYearsOfService() {
        TicketSeller ticketSeller = new TicketSeller("Bart", "Simpson", 2020);
        int yearsOfService = ticketSeller.yearsOfService();
        assertEquals(3, yearsOfService);

    }
}