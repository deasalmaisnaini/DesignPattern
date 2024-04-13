package com.strategypattern.strategypattern.order;

import com.strategypattern.strategypattern.strategies.PayStrategy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class Order {
    private int totalCost = 0;
    private boolean closed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed() {
        closed = true;
    }
}
