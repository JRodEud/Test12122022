package com.challenges.test12122022.Request;

import lombok.Data;

import java.util.Date;

@Data
public class ProdAvailabilityRequest {

    private String storeNo;
    private String productId;
    private Date reqDate;
    private double reqQty;
}
