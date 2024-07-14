package com.inventoryhub.inventoryhub.services;

import com.inventoryhub.inventoryhub.entities.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();
}
