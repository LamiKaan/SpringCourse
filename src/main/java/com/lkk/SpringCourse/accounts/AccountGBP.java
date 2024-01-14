package com.lkk.SpringCourse.accounts;

import java.text.NumberFormat;
import java.util.Locale;

public class AccountGBP implements Account {
    // Account balance in cents
    private long balance = 101100;

    AccountGBP() {
        System.out.println("In constructor of the " + getClass().getSimpleName().toUpperCase() + " class");
    }


    @Override
    public String printBalance() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.UK);
        return currencyFormatter.format(balance/100);
    }
}
