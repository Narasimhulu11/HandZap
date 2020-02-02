package com.mnsd.newsscraper.controller;

import com.mnsd.newsscraper.model.ArticleCategory;
import com.mnsd.newsscraper.service.ArticleCategoryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ArticleCategoryController to handle all requests of ArticleCategory model
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */

@RestController
@RequestMapping("/articles/category")
@ApiOperation(value = "rest api's in article category controller")
@Slf4j
public class ArticleCategoryController {

    private ArticleCategoryService articleCategoryService;

    public ArticleCategoryController(ArticleCategoryService articleCategoryService) {
        this.articleCategoryService = articleCategoryService;
    }

    @PostMapping("/add/{category}")
    public ArticleCategory addArticleCategory(@PathVariable String category){
        return this.articleCategoryService.addArticleCategory(category);
    }

    @GetMapping("/get")
    public List<ArticleCategory> getAllCategories(){
        return this.articleCategoryService.getAllCategories();
    }
}
