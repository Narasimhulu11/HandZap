package com.mnsd.newsscraper.controller;

import com.mnsd.newsscraper.model.ArticleCity;
import com.mnsd.newsscraper.service.ArticleCityService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ArticleCityController to handle all requests of ArticleCity model
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */

@RestController
@RequestMapping("/articles/city")
@ApiOperation(value = "rest api's in article city controller")
@Slf4j
public class ArticleCityController {

    private ArticleCityService articleCityService;

    public ArticleCityController(ArticleCityService articleCityService) {
        this.articleCityService = articleCityService;
    }

    @PostMapping("/add")
    public ArticleCity addArticleCity(@RequestBody ArticleCity city){
        return this.articleCityService.addArticleCity(city);
    }

    @GetMapping("/get")
    public List<ArticleCity> getAllCities(){
        return this.articleCityService.getAllCities();
    }
}
