package com.mnsd.newsscraper.service;

import com.mnsd.newsscraper.model.Author;
import com.mnsd.newsscraper.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * service class for Author
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }

    public List<Author> getAuthorByName(String authorName) {
        return this.authorRepository.findByAuthorNameContaining(authorName);
    }
    public Author getOne(Integer authorId) {
        return this.authorRepository.findById(authorId).get();
    }
}
