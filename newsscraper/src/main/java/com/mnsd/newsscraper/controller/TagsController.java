package com.mnsd.newsscraper.controller;

import com.mnsd.newsscraper.model.Tags;
import com.mnsd.newsscraper.service.TagsService;
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
@RequestMapping("/articles/tags")
@ApiOperation(value = "rest api's in article category controller")
@Slf4j
public class TagsController {

    private TagsService tagsService;

    public TagsController(TagsService tagsService) {
        this.tagsService = tagsService;
    }

    @PostMapping("/add/{tag}")
    public Tags addArticleTags(@PathVariable String tag){
        return this.tagsService.addArticleTags(tag);
    }

    @GetMapping("/get")
    public List<Tags> getAllTags(){
        return this.tagsService.getAllTags();
    }
}
