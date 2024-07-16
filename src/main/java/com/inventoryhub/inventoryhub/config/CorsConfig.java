package com.inventoryhub.inventoryhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Autoriser toutes les origines (à adapter selon vos besoins)
        config.addAllowedOrigin("http://localhost:5173");

        // Autoriser toutes les méthodes HTTP
        config.addAllowedMethod("*");

        // Autoriser tous les en-têtes
        config.addAllowedHeader("*");

        // Autoriser l'envoi de cookies par le navigateur
        config.setAllowCredentials(true);

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
