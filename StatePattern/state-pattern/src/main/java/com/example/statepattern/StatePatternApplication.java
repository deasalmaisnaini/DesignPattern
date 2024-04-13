package com.example.statepattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatePatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatePatternApplication.class, args);

        // Create a new instance of CandyVendingMachine and perform operations
        CandyVendingMachine machine = new CandyVendingMachine(5);
        System.out.println("Initial state:");
        System.out.println(machine);

        // Insert coin and press button
        machine.insertCoin();
        machine.pressButton();
        System.out.println("After inserting coin and pressing button:");
        System.out.println(machine);

        // Refill candies and eject candy
        machine.refillCandy(3);
        machine.ejectCandy();
        System.out.println("After refilling candies and ejecting one candy:");
        System.out.println(machine);
    }
}
