package com.challenges.test12122022.models;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private String productID;
    private String productName;
    private String unitOfMeasure;
    private Date launchDate;
}
