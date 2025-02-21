package com.example.pitest.discountcalculator;

import com.example.pitest.discountcalculator.domain.Customer;
import com.example.pitest.discountcalculator.domain.StandardCustomer;
import com.example.pitest.discountcalculator.domain.VIPCustomer;

public class DiscountCalculator {
    public static int applyDiscount(final Customer customer, final int purchaseAmount) {
        return switch (customer) {
            case VIPCustomer _ -> calculateVipDiscount(purchaseAmount);
            case StandardCustomer _ -> calculateStandardDiscount(purchaseAmount);
        };
    }

    private static int calculateVipDiscount(final int purchaseAmount) {
        return (int) (purchaseAmount * 0.85);
    }

    private static int calculateStandardDiscount(final int purchaseAmount) {
        return (int) (purchaseAmount * 0.95);
    }
}