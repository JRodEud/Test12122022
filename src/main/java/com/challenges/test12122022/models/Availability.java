package com.challenges.test12122022.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Availability {

    private String storeNo;
    private String productId;
    private Date date;
    private double availQty;
}
