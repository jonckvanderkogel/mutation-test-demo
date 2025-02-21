package com.example.pitest.discountcalculator;

import com.example.pitest.discountcalculator.domain.Customer;
import com.example.pitest.discountcalculator.domain.StandardCustomer;
import com.example.pitest.discountcalculator.domain.VIPCustomer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class DiscountCalculatorTest {

    @Test
    void testApplyDiscountForVipCustomer() {
        final Customer vip = new VIPCustomer("Alice");
        final int purchaseAmount = 100;

        final int discounted = DiscountCalculator.applyDiscount(vip, purchaseAmount);
        Assertions.assertEquals(85, discounted, "Discounted price should be less than original price.");
    }

    @Test
    void testApplyDiscountForStandardCustomer() {
        final Customer standard = new StandardCustomer("Bob");
        final int purchaseAmount = 100;

        final int discounted = DiscountCalculator.applyDiscount(standard, purchaseAmount);
        Assertions.assertTrue(discounted < purchaseAmount,
                "Discounted price should be less than original price.");
    }
}
