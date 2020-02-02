package com.mnsd.newsscraper.repository;

import com.mnsd.newsscraper.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Repository  interface for Author
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
    List<Author> findByAuthorNameLike(String authorName);

    Author findByAuthorName(String mnsd);

    List<Author> findByAuthorNameContaining(String authorName);
}
