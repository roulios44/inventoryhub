package com.inventoryhub.inventoryhub.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryhub.inventoryhub.services.ArticleService;

import lombok.RequiredArgsConstructor;

import com.inventoryhub.inventoryhub.entities.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

public class ArticlesRestRepository {
    private final ArticleService articlesService;

    @GetMapping(path = "/articles/all")
    public List<Article> getAllArticles(){
        return articlesService.findAll();
    }
}
