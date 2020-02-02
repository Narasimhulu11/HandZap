package com.mnsd.newsscraper.controller;

import com.mnsd.newsscraper.model.Author;
import com.mnsd.newsscraper.service.AuthorService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * AuthorController to handle all requests of Author model
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */

@RestController
@RequestMapping("/author")
@ApiOperation(value = "rest api's in author controller")
@Slf4j
public class AuthorController {

    /**
     * injecting author service
     */
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    /**
     *  rest api to get all authors
     * @return returns list of authors
     */
    @ApiOperation(value = "rest api to get all authors")
    @GetMapping("/search")
    public List<Author> getAuthors(){
        List<Author> authors = null;
        try {
            authors= this.authorService.getAllAuthors();
        }catch (Exception ex){
            log.error("Exception occurred at getAllAuthors  exception is {}",
                    ex.toString());
        }
        return authors;
    }

    /**
     *  rest api to get all authors by authorName
     * @param authorName path variable that maps authorName in Author class
     * @return returns list of articles that are associated with #authorName
     */
    @ApiOperation(value = "rest api to get all authors by authorName")
    @GetMapping("/search/{authorName}")
    public List<Author> getAuthorByName(@PathVariable String authorName){
        List<Author> authors = null;
        try {
            authors= this.authorService.getAuthorByName(authorName);
        }catch (Exception ex){
            log.error("Exception occurred at getAuthorByName for authorName: {} and exception is {}",
                    authorName,
                    ex.toString());
        }
        return authors;
    }

    /**
     *  rest api to add author
     * @param author request body that maps author in Author class
     * @return returns author
     */
    @ApiOperation(value = "rest api to add author")
    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author){
        Author authors = null;
        try {
            authors= this.authorService.addAuthor(author);
        }catch (Exception ex){
            log.error("Exception occurred at getAuthorByName for author: {} and exception is {}",
                    author,
                    ex.toString());
        }
        return authors;
    }
}
