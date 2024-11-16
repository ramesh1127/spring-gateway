//package com.sra.gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private final UserDetailsService userDetailsService;
//
//    public SecurityConfig(UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf().disable()  // Disable CSRF for simplicity (consider enabling for production)
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/user/**", "/dept/**").authenticated() // Protect these endpoints
//                .anyRequest().permitAll()
//            )
//            .addFilterBefore(null, UsernamePasswordAuthenticationFilter.class);
//
//        return http.build();
//    }
//}
//
