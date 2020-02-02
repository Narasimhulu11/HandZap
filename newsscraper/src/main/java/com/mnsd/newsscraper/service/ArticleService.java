package com.mnsd.newsscraper.service;

import com.mnsd.newsscraper.model.Articles;
import com.mnsd.newsscraper.model.Author;
import com.mnsd.newsscraper.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
/**
 * service class for Articles
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */
@Service
public class ArticleService {

    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Articles> getAllArticlesByTitle(String title) {
        return this.articleRepository.findByArticleTitleContaining(title);
    }

    public List<Articles> getAllArticlesByDescription(String description) {
        return this.articleRepository.findByArticleDescriptionContaining(description);
    }

    public List<Articles> getAllArticlesByTitleAndDescription(String title, String description) {
        return this.articleRepository.findByArticleTitleContainingAndArticleDescriptionContaining(title,description);
    }

    public List<Articles> getArticlesByAuthor(String author) {
        return this.articleRepository.findByAuthorNameLike("%"+author+"%");
    }


    public List<Articles> getArticlesOnDate(Date date) {
        return this.articleRepository.findByArticleOnDate(date);
    }

    public List<Author> getAuthorsOnDate(Date date) {
        return this.articleRepository.findAuthorsByArticleOnDate(date);
    }

    public List<Articles> getArticlesByTags(List<String> tags) {
        return this.articleRepository.findByTags(tags);
    }

    public List<Articles> getArticlesByPincode(int pincode) {
        return this.articleRepository.findByPincode(pincode);
    }

    public List<Articles> getArticlesByCategoryId(int categoryId) {
        return this.articleRepository.findArticlesByCategoryId(categoryId);
    }

    public List<Articles> getArticlesByCity(String city) {
        return this.articleRepository.findByCity("%"+city+"%");
    }

    public List<Articles> getArticlesByCategory(String category) {
        return this.articleRepository.findByCategory(category);
    }
}
