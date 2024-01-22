package com.lkk.SpringCourse.accounts;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.Locale;

@Component
@Primary
@Lazy // "SCOPE_PROTOTYPE" is lazy by default
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //SCOPE_PROTOTYPE/REQUEST/SESSION/GLOBAL-SESSION
public class AccountTRY implements Account{

    // Account balance in cents
    private long balance = 12300;

    public AccountTRY() {
        System.out.println("In constructor of the " + getClass().getSimpleName().toUpperCase() + " class");
    }

    // Method to be performed once the object is just created (initialization method)
    @PostConstruct
    public void startUpStuff() {
        System.out.println("In start-up method of the " + getClass().getSimpleName().toUpperCase() + " class");
    }

    // Method to be performed just before the object is destroyed (termination method)
    // Doesn't work for "prototype" scope
    @PreDestroy
    public void cleanUpStuff() {
        System.out.println("In clean-up method of the " + getClass().getSimpleName().toUpperCase() + " class");
    }


    @Override
    public String getBalanceAsString() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("tr"));
        return currencyFormatter.format(balance/100);
    }
}
