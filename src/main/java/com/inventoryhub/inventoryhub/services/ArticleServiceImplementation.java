package com.inventoryhub.inventoryhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryhub.inventoryhub.repositories.ArticleRepository;

import jakarta.transaction.Transactional;

import com.inventoryhub.inventoryhub.entities.Article;


@Service
@Transactional
public class ArticleServiceImplementation implements ArticleService {
    
    @Autowired
    ArticleRepository articlesRepository;

    @Override
    public List<Article> findAll() {
        return articlesRepository.findAll();
    }
}
