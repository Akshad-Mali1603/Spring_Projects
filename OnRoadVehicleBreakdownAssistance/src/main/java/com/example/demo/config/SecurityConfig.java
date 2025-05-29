package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Log to confirm that the bean is being created
        System.out.println("PasswordEncoder bean is being created!");
        return new BCryptPasswordEncoder(); // Create and return a BCryptPasswordEncoder bean
    }
}
