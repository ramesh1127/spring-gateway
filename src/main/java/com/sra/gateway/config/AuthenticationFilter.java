package com.sra.gateway.config;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

@Component
public class AuthenticationFilter implements WebFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
       try {
    	// Check for the Authorization header or any other required token
        String authHeader = exchange.getRequest().getHeaders().getFirst("Authorization");
        System.out.println("auth header---> "+authHeader);
        String token=authHeader.substring(7);
        System.out.println("auth header---> "+token);
        
        if (token == null || !isTokenValid(token)) {
            // Reject request with 401 Unauthorized if the token is missing or invalid
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
       }catch(Exception e) {
    	   exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
           
           return exchange.getResponse().setComplete();
           
       }
        // If authentication is successful, proceed to the next filter
      
    }

    private boolean isTokenValid(String token) {
        // Implement your token validation logic here
        return true; // Replace with actual validation logic
    }
}
