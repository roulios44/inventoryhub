package com.inventoryhub.inventoryhub.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.inventoryhub.inventoryhub.entities.Supplier;
import com.inventoryhub.inventoryhub.entities.User;


@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(
      RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Supplier.class,User.class);
    }
}