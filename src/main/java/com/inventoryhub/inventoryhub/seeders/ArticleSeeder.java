package com.inventoryhub.inventoryhub.seeders;

import java.util.Arrays;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.inventoryhub.inventoryhub.entities.Article;
import com.inventoryhub.inventoryhub.repositories.ArticleRepository;

@Component
public class ArticleSeeder implements ApplicationListener<ContextRefreshedEvent> {

    private final ArticleRepository articleRepository;

    public ArticleSeeder(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.loadArticles();
    }

    private void loadArticles() {
        Article article1 = new Article();
        article1.setTitle("Article 1");
        article1.setDescription("Description for Article 1");
        article1.setPrice(10.0);

        Article article2 = new Article();
        article2.setTitle("Article 2");
        article2.setDescription("Description for Article 2");
        article2.setPrice(20.0);

        articleRepository.saveAll(Arrays.asList(article1, article2));
        
    }
}
