package com.test.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.HeadersDsl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .csrf(csrfConfig
                    -> csrfConfig.disable())
                .headers(headers ->headers.frameOptions(frameOptionsConfig ->
                        frameOptionsConfig.disable()));


        return httpSecurity.build();
    }
}
