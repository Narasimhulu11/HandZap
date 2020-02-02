package com.mnsd.newsscraper.service;

import com.mnsd.newsscraper.model.ArticleCity;
import com.mnsd.newsscraper.repository.ArticleCityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleCityService {

    private ArticleCityRepository articleCityRepository;

    public ArticleCityService(ArticleCityRepository articleCityRepository) {
        this.articleCityRepository = articleCityRepository;
    }

    public ArticleCity addArticleCity(ArticleCity city) {
        return this.articleCityRepository.save(city);
    }

    public List<ArticleCity> getAllCities() {
        return this.articleCityRepository.findAll();
    }

    public ArticleCity getOne(Integer pincode) {
        return this.articleCityRepository.findById(pincode).get();
    }
}
