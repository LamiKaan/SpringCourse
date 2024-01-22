package com.lkk.SpringCourse.rest;

import com.lkk.SpringCourse.accounts.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class AccountRestController {

    private Account userAccount;

//    @Autowired
    public AccountRestController(@Qualifier("accountGBP") Account userAccount) {
//        System.out.println("In constructor of the " + getClass().getSimpleName().toUpperCase() + " class");
        this.userAccount = userAccount;
    }

//    @Autowired
//    public void setAccount(@Qualifier("accountUSD") Account userAccount) {
//        this.userAccount = userAccount;
//    }

    @GetMapping("/account")
    public String displayAccountBalance() {
        String balance = this.userAccount.getBalanceAsString();
        return String.format("Account balance: %s", balance);
    }
}
