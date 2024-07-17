package com.inventoryhub.inventoryhub.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.util.ClassUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(
        RepositoryRestConfiguration config, CorsRegistry cors) {
        // Expose IDs for all entities in the specified package
        exposeIdsForAllEntities("com.inventoryhub.inventoryhub.entities", config);
    }

    private void exposeIdsForAllEntities(String basePackage, RepositoryRestConfiguration config) {
        List<Class<?>> entityClasses = getClassesInPackage(basePackage);
        config.exposeIdsFor(entityClasses.toArray(new Class[0]));
    }

    private List<Class<?>> getClassesInPackage(String basePackage) {
        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
        // Here we can add filters if needed, for example to filter only entity classes.
        scanner.addIncludeFilter(new AssignableTypeFilter(Object.class));

        Set<BeanDefinition> beanDefinitions = scanner.findCandidateComponents(basePackage);
        List<Class<?>> classes = new ArrayList<>();
        for (BeanDefinition beanDefinition : beanDefinitions) {
            try {
                classes.add(ClassUtils.forName(beanDefinition.getBeanClassName(), ClassUtils.getDefaultClassLoader()));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return classes;
    }
}
