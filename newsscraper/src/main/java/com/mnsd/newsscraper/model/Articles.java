package com.mnsd.newsscraper.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
/**
 * Entity class for Articles
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */
@Entity
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer articlesId;

    private String articleTitle;

    @Column(columnDefinition = "TEXT")
    private String articleDescription;

    @OneToOne
    private ArticleCategory articleCategory;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date articleOnDate;

    @OneToOne
    private ArticleCity articleCity;

    @ManyToMany
    private List<Tags> tags;

    @OneToOne
    private Author author;

    public Articles() {
    }

    public Articles(String articleTitle, String articleDescription, ArticleCategory articleCategory, Date articleOnDate, ArticleCity articleCity, List<Tags> tags, Author author) {
        this.articleTitle = articleTitle;
        this.articleDescription = articleDescription;
        this.articleCategory = articleCategory;
        this.articleOnDate = articleOnDate;
        this.articleCity = articleCity;
        this.tags = tags;
        this.author = author;
    }

    public Integer getArticlesId() {
        return articlesId;
    }

    public void setArticlesId(Integer articlesId) {
        this.articlesId = articlesId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public ArticleCategory getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(ArticleCategory articleCategory) {
        this.articleCategory = articleCategory;
    }

    public Date getArticleOnDate() {
        return articleOnDate;
    }

    public void setArticleOnDate(Date articleOnDate) {
        this.articleOnDate = articleOnDate;
    }

    public ArticleCity getArticleCity() {
        return articleCity;
    }

    public void setArticleCity(ArticleCity articleCity) {
        this.articleCity = articleCity;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
