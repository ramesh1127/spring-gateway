//package com.sra.gateway.config;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Implement user retrieval logic, e.g., from a database
//        if ("user".equals(username)) {
//            return org.springframework.security.core.userdetails.User.withUsername("user")
//                .password("{noop}password") // Use {noop} for plain text
//                .roles("USER")
//                .build();
//        }
//        throw new UsernameNotFoundException("User not found");
//    }
//}
