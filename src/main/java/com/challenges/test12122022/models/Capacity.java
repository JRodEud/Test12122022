package com.challenges.test12122022.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Capacity {
    private String storeNo;
    private String productId;
    private Date date;
    private double noOfOrdersAccepted;
}
