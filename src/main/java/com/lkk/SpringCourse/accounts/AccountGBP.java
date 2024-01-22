package com.lkk.SpringCourse.accounts;

import jakarta.annotation.PostConstruct;

import java.text.NumberFormat;
import java.util.Locale;

public class AccountGBP implements Account {
    // Account balance in cents
    private long balance = 101100;

    public AccountGBP() {
        System.out.println("In constructor of the " + getClass().getSimpleName().toUpperCase() + " class");
    }

    @Override
    public String getBalanceAsString() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.UK);
        return currencyFormatter.format(balance/100);
    }
}
