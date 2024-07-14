package com.inventoryhub.inventoryhub.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryhub.inventoryhub.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    
}
