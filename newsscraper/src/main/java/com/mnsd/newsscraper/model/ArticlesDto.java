package com.mnsd.newsscraper.model;

import java.util.List;


public class ArticlesDto {

    private String articleTitle;

    private String articleDescription;

    private Integer articleCategoryId;

    private String articleOnDate;

    private Integer pincode;

    private List<Integer> tagsId;

    private Integer authorId;

    public ArticlesDto() {
    }

    public ArticlesDto(String articleTitle, String articleDescription, Integer articleCategoryId, String articleOnDate, Integer pincode, List<Integer> tagsId, Integer authorId) {
        this.articleTitle = articleTitle;
        this.articleDescription = articleDescription;
        this.articleCategoryId = articleCategoryId;
        this.articleOnDate = articleOnDate;
        this.pincode = pincode;
        this.tagsId = tagsId;
        this.authorId = authorId;
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

    public Integer getArticleCategoryId() {
        return articleCategoryId;
    }

    public void setArticleCategoryId(Integer articleCategoryId) {
        this.articleCategoryId = articleCategoryId;
    }

    public String getArticleOnDate() {
        return articleOnDate;
    }

    public void setArticleOnDate(String articleOnDate) {
        this.articleOnDate = articleOnDate;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public List<Integer> getTagsId() {
        return tagsId;
    }

    public void setTagsId(List<Integer> tagsId) {
        this.tagsId = tagsId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
