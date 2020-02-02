package com.mnsd.newsscraper.repository;

import com.mnsd.newsscraper.model.ArticleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository  interface for ArticleCategory
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */
@Repository
public interface ArticleCategoryRepository extends JpaRepository<ArticleCategory,Integer> {
}
