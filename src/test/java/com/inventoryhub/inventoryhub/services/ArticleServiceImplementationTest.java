package com.inventoryhub.inventoryhub.services;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.inventoryhub.inventoryhub.entities.Article;
import com.inventoryhub.inventoryhub.repositories.ArticleRepository;

public class ArticleServiceImplementationTest {

    @Mock
    private ArticleRepository articleRepository;

    @InjectMocks
    private ArticleServiceImplementation articleService;

    private Article article1;
    private Article article2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        article1 = new Article();
        article1.setId(1L);
        article1.setTitle("Article 1");

        article2 = new Article();
        article2.setId(2L);
        article2.setTitle("Article 2");
    }

    @Test
    void testFindAll() {
        when(articleRepository.findAll()).thenReturn(Arrays.asList(article1, article2));

        List<Article> articles = articleService.findAll();
        assertEquals(2, articles.size());
        assertEquals("Article 1", articles.get(0).getTitle());
        assertEquals("Article 2", articles.get(1).getTitle());
    }
}
