package com.lkk.SpringCourse.accounts;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.Locale;

@Component
@Lazy
public class AccountUSD implements Account{

    // Account balance in cents
    private long balance = 45600;

    AccountUSD() {
        System.out.println("In constructor of the " + getClass().getSimpleName().toUpperCase() + " class");
    }


    @Override
    public String printBalance() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyFormatter.format(balance/100);
    }
}
