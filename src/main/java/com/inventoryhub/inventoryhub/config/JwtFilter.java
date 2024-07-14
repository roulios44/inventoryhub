package com.inventoryhub.inventoryhub.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {
    private final String secret = "secret";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String header = request.getHeader("Authorization");
        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
            // Vérifiez les réclamations et définissez l'authentification dans le contexte de sécurité
        }
        filterChain.doFilter(request, response);
    }
}
