//package com.test.security.config;
//
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.csrf((csrfConfig)
//                -> csrfConfig.disable());
//        ).headers((headerConfig) ->
//                headerConfig.frameOptions(frameOptionsConfig ->
//                        frameOptionsConfig.disable())
//        )
//                .authorizeHttpRequests((authorizeRequests)->
//                        authorizeRequests
//                                .requestMatchers(PathRequest.toH2Console()).permitAll()
//                                .anyRequest().authenticated());
//
//        return httpSecurity.build();
//    }
//
//}
