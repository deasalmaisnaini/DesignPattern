package com.strategypattern.strategypattern.strategies;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
@Data
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = reader.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = reader.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = reader.readLine();
            card = new CreditCard(number, date, cvv);
            // Validate credit card number...
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
