package com.mnsd.newsscraper.model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Entity class for ArticleCity
 * @author Narasimhulu Madhana
 * @since 02/02/2020
 * @version 0.0.1-SNAPSHOT
 */

@Entity
public class ArticleCity {

    @Id
    private Integer pincode;

    private String city;

    public ArticleCity() {
    }

    public ArticleCity(Integer pincode, String city) {
        this.pincode = pincode;
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
