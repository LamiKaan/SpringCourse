package com.lkk.SpringCourse.configurators;

import com.lkk.SpringCourse.accounts.Account;
import com.lkk.SpringCourse.accounts.AccountGBP;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfigurator {

    @Bean()
    //Bean ID (Class Name = AccountGBP) should default (be same with except lowercase first letter) to the method name
    public Account accountGBP() {
        return new AccountGBP();
    }
}
