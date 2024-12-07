package com.klef.jfsd.exam.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {

    @JsonProperty("id")
    private long id;  

    @JsonProperty("title")
    private String title;  

    @JsonProperty("description")
    private String description;  

    @JsonProperty("category")
    private String category;  

    @JsonProperty("image")
    private String image;  

    @JsonProperty("price")
    private double price;  

    @JsonProperty("rating")
    private Rating rating; 
}
