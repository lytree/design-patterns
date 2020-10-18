package com.design.strategy;

/**
 * Common interface for all strategies.
 * 所有策略的通用接口
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
