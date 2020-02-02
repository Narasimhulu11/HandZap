package com.mnsd.newsscraper.repository;

import com.mnsd.newsscraper.model.Articles;
import com.mnsd.newsscraper.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
/**
 * Repository  interface for Articles
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */
@Repository
public interface ArticleRepository extends JpaRepository<Articles,Integer> {

    List<Articles> findByArticleTitleContaining(String title);

    List<Articles> findByArticleDescriptionContaining(String description);

    List<Articles> findByArticleTitleContainingAndArticleDescriptionContaining(String title, String description);

    @Query("select articles from Articles articles where articles.author.authorName Like ?1")
    List<Articles> findByAuthorNameLike(String author);

    List<Articles> findByArticleOnDate(Date date);

    @Query("select distinct(articles.author) from Articles articles where articles.articleOnDate = ?1")
    List<Author> findAuthorsByArticleOnDate(Date date);

    @Query("select distinct(articles) from Articles articles inner join articles.tags tags where tags.tag in ?1")
    List<Articles> findByTags(List<String> tags);

    @Query("select distinct(articles) from Articles articles where articles.articleCity.pincode = ?1")
    List<Articles> findByPincode(int pincode);

    @Query("select distinct(articles) from Articles articles where articles.articleCategory.categoryId = ?1")
    List<Articles> findArticlesByCategoryId(int categoryId);

    @Query("select distinct(articles) from Articles articles where articles.articleCity.city like ?1")
    List<Articles> findByCity(String city);

    @Query("select distinct(articles) from Articles articles where articles.articleCategory.categoryName like ?1")
    List<Articles> findByCategory(String category);
}
