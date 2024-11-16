//package com.sra.gateway.config;
//
//import java.io.IOException;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class TokenAuthenticationFilter extends OncePerRequestFilter {
//
//    private final UserDetailsService userDetailsService;
//
//    public TokenAuthenticationFilter(UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//        
//        String token = request.getHeader(HttpHeaders.AUTHORIZATION);
//        
//        if (token != null && token.startsWith("Bearer ")) {
//            String username = validateToken(token.substring(7)); // Extract username from the token
//            
//            if (username != null) {
//                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//                UsernamePasswordAuthenticationToken authentication =
//                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            }
//        }
//        
//        filterChain.doFilter(request, response);
//    }
//
//    private String validateToken(String token) {
//        // Your token validation logic here (e.g., decode and check validity)
//        // Return the username if valid, or null if invalid.
//        if ("valid-token".equals(token)) {  // Example validation
//            return "user"; // Replace with actual username
//        }
//        return null;
//    }
//}
