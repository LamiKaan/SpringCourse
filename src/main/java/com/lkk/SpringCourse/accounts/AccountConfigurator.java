package com.lkk.SpringCourse.accounts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfigurator {

    @Bean
    public Account accountGBP() {
        return new AccountGBP();
    }
}
