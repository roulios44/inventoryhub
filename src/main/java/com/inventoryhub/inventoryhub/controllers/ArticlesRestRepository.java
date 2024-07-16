package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.entities.Article;
import com.inventoryhub.inventoryhub.services.ArticleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")

public class ArticlesRestRepository {
    private final ArticleService articlesService;

    @GetMapping(path = "/articles/all")
    public List<Article> getAllArticles(){
        return articlesService.findAll();
    }
}
