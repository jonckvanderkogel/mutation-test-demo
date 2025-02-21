package com.example.pitest.discountcalculator.domain;

public sealed interface Customer permits StandardCustomer, VIPCustomer {
    String name();
}
