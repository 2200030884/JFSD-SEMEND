package com.klef.jfsd.exam.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rating {

    @JsonProperty("rate")
    private double rate;  

    @JsonProperty("count")
    private int count;  }
