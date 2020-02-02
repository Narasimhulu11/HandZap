package com.mnsd.newsscraper.controller;

import com.mnsd.newsscraper.model.Articles;
import com.mnsd.newsscraper.model.Author;
import com.mnsd.newsscraper.service.ArticleService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * ArticleController to handle all requests of Article model
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */

@RestController
@RequestMapping("/articles")
@ApiOperation(value = "rest api's in article controller")
@Slf4j
public class ArticleController {

    /**
     * injecting article service
     */
    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    /**
     *  rest api to get all articles by title
     * @param title path variable that maps title in Articles class
     * @return returns list of articles that are associated with #title
     */
    @ApiOperation(value = "rest api to get all articles by title")
    @GetMapping("/search/title/{title}")
    public List<Articles> getAllArticlesByTitle(@PathVariable String title){
        List<Articles> articles = null;
        try {
            articles= this.articleService.getAllArticlesByTitle(title);
        }catch (Exception ex){
            log.error("Exception occurred at getAllArticlesByTitle for title: {} and exception is {}",
                    title,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles by description
     * @param description path variable that maps description in Articles class
     * @return returns list of articles that are associated with #description
     */
    @ApiOperation(value = "rest api to get all articles by description")
    @GetMapping("/search/description/{description}")
    public List<Articles> getAllArticlesByDescription(@PathVariable String description){
        List<Articles> articles = null;
        try {
            articles= this.articleService.getAllArticlesByDescription(description);
        }catch (Exception ex){
            log.error("Exception occurred at getAllArticlesByDescription for description: {} and exception is {}",
                    description,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles by title and  description
     * @param title path variable that maps title in Articles class
     * @param description path variable that maps description in Articles class
     * @return returns list of articles that are associated with #title and  #description
     */
    @ApiOperation(value = "rest api to get all articles by title and  description")
    @GetMapping("/search/{title}/{description}")
    public List<Articles> getAllArticlesByTitleAndDescription(@PathVariable("title") String title,@PathVariable("description") String description){
        List<Articles> articles = null;
        try {
            articles= this.articleService.getAllArticlesByTitleAndDescription(title, description);
        }catch (Exception ex){
            log.error("Exception occurred at getAllArticlesByTitleAndDescription for title: {} and description: {} and exception is {}",
                    title,
                    description,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles by author name
     * @param author path variable that maps authorName in Author class
     * @return returns list of articles that are associated with #author
     */
    @ApiOperation(value = "rest api to get all articles by author name")
    @GetMapping("/search/author/{author}")
    public List<Articles> getArticlesByAuthor(@PathVariable String author){
        List<Articles> articles = null;
        try {
            return this.articleService.getArticlesByAuthor(author);
        }catch (Exception ex){
            log.error("Exception occurred at getArticlesByAuthor for author: {} and exception is {}",
                    author,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles on date
     * @param date path variable that maps articleOnDate in Article class
     * @return returns list of articles that are associated with #date
     */
    @ApiOperation(value = " rest api to get all articles on date")
    @GetMapping("/search/on/{date}")
    public List<Articles> getArticlesOnDate(@PathVariable String date) throws ParseException {
        List<Articles> articles = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            articles= this.articleService.getArticlesOnDate(formatter.parse(date));
        }catch (Exception ex){
            log.error("Exception occurred at getArticlesOnDate for date: {} and exception is {}",
                    date,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all authors published articles on date
     * @param date path variable that maps articleOnDate in Article class
     * @return returns list of authors published articles on #date
     */
    @ApiOperation(value = "rest api to get all authors published articles on date")
    @GetMapping("/search/authors/{date}")
    public List<Author> getAuthorsOnDate(@PathVariable String date) throws ParseException {
        List<Author> authors = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            authors= this.articleService.getAuthorsOnDate(formatter.parse(date));
        }catch (Exception ex){
            log.error("Exception occurred at getAuthorsOnDate for date: {} and exception is {}",
                    date,
                    ex.toString());
        }
        return authors;
    }

    /**
     * rest api to get all articles associated on multiple tags
     * @param tags path variable that maps tags in Tags class
     * @return returns list of articles that are associated with #tags
     */
    @ApiOperation(value = "rest api to get all articles associated on multiple tags")
    @PostMapping("/search/tags")
    public List<Articles> getArticlesByTags(@RequestBody List<String> tags){
        List<Articles> articles = null;
        try {
            articles= this.articleService.getArticlesByTags(tags);
        }catch (Exception ex){
            log.error("Exception occurred at getArticlesByTags for tags: {} and exception is {}",
                    tags,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles associated to pincode location
     * @param pincode path variable that maps pincode in ArticleCity class
     * @return returns list of articles that are associated with #pincode
     */
    @ApiOperation(value = "rest api to get all articles associated to pincode location")
    @GetMapping("/search/pin/{pincode}")
    public List<Articles> getArticlesByPincode(@PathVariable String pincode){
        List<Articles> articles = null;
        try {
            return this.articleService.getArticlesByPincode(Integer.parseInt(pincode));
        }catch (Exception ex){
            log.error("Exception occurred at getArticlesByPincode for pincode: {} and exception is {}",
                    pincode,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles associated to city
     * @param city path variable that maps tags in Tags class
     * @return returns list of articles that are associated with #city
     */
    @ApiOperation(value = "rest api to get all articles associated to city")
    @GetMapping("/search/city/{city}")
    public List<Articles> getArticlesByCity(@PathVariable String city){
        List<Articles> articles = null;
        try {
            articles = this.articleService.getArticlesByCity(city);
        }catch (Exception ex){
            log.error("Exception occurred at getArticlesByCity for city: {} and exception is {}",
                    city,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles associated to categoryId
     * @param categoryId path variable that maps categoryId in ArticleCategory class
     * @return returns list of articles that are associated with #categoryId
     */
    @ApiOperation(value = "rest api to get all articles associated to categoryId")
    @GetMapping("/search/category/{categoryId}")
    public List<Articles> getArticlesByCategoryId(@PathVariable String categoryId){
        List<Articles> articles = null;
        try {
            articles= this.articleService.getArticlesByCategoryId(Integer.parseInt(categoryId));
        }catch (Exception ex){
            log.error("Exception occurred at getArticlesByCategoryId for categoryId: {} and exception is {}",
                    categoryId,
                    ex.toString());
        }
        return articles;
    }

    /**
     * rest api to get all articles associated to category
     * @param category path variable that maps categoryName in ArticleCategory class
     * @return returns list of articles that are associated with #category
     */
    @ApiOperation(value = "rest api to get all articles associated to category")
    @GetMapping("/search/category/name/{category}")
    public List<Articles> getArticlesByCategory(@PathVariable String category){
        List<Articles> articles = null;
        try {
            articles = this.articleService.getArticlesByCategory(category);
        }catch (Exception ex){
            log.error("Exception occurred at getArticlesByCategoryId for category: {} and exception is {}",
                    category,
                    ex.toString());
        }
        return articles;
    }

}
