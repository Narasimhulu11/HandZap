package com.mnsd.newsscraper.service;

import com.mnsd.newsscraper.model.ArticleCategory;
import com.mnsd.newsscraper.repository.ArticleCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleCategoryService {

    private ArticleCategoryRepository articleCategoryRepository;

    public ArticleCategoryService(ArticleCategoryRepository articleCategoryRepository) {
        this.articleCategoryRepository = articleCategoryRepository;
    }

    public ArticleCategory addArticleCategory(String category) {
        return this.articleCategoryRepository.save(new ArticleCategory(category));
    }

    public List<ArticleCategory> getAllCategories() {
        return this.articleCategoryRepository.findAll();
    }

    public ArticleCategory getOne(Integer articleCategoryId) {
        return articleCategoryRepository.findById(articleCategoryId).get();
    }
}
