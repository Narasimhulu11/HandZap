package com.mnsd.newsscraper.service;

import com.mnsd.newsscraper.model.*;
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

    private ArticleCategoryService articleCategoryService;
    private ArticleCityService articleCityService;
    private AuthorService authorService;
    private TagsService tagsService;

    public ArticleService(ArticleRepository articleRepository, ArticleCategoryService articleCategoryService, ArticleCityService articleCityService, AuthorService authorService, TagsService tagsService) {
        this.articleRepository = articleRepository;
        this.articleCategoryService = articleCategoryService;
        this.articleCityService = articleCityService;
        this.authorService = authorService;
        this.tagsService = tagsService;
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

    public Articles addArticle(ArticlesDto articlesDto) {
        ArticleCategory articleCategory =articleCategoryService.getOne(articlesDto.getArticleCategoryId());
        ArticleCity articleCity =articleCityService.getOne(articlesDto.getPincode());
        Author author = authorService.getOne(articlesDto.getAuthorId());
        List<Tags> tags = tagsService.getTags(articlesDto.getTagsId());
        Articles articles=new  Articles(articlesDto.getArticleTitle(),articlesDto.getArticleDescription(),articleCategory,new Date(),articleCity,tags,author);
        return this.articleRepository.save(articles);
    }

    public List<Articles> getAllArticle() {
        return articleRepository.findAll();
    }
}
