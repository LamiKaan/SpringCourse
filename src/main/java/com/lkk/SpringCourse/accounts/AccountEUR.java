package com.lkk.SpringCourse.accounts;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.Locale;

@Component
@Lazy
public class AccountEUR implements Account{

    // Account balance in cents
    private long balance = 78900;

    AccountEUR() {
        System.out.println("In constructor of the " + getClass().getSimpleName().toUpperCase() + " class");
    }


    @Override
    public String printBalance() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        return currencyFormatter.format(balance/100);
    }
}
