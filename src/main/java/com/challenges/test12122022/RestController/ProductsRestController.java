package com.challenges.test12122022.RestController;

import com.challenges.test12122022.Request.ProdAvailabilityRequest;
import com.challenges.test12122022.Service.ProductService;
import com.challenges.test12122022.models.Availability;
import com.challenges.test12122022.models.ProductList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsRestController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/sortProducts")
    public @ResponseBody ProductList sortProducts() {
        return new ProductList();
    }

    @PostMapping(value = "/getProdAvailability")
    public @ResponseBody List<Availability> getProdAvailability(@RequestBody ProdAvailabilityRequest request) {
        List<Availability> availabilities = productService.getAvailability(request.getStoreNo(), request.getReqDate());
        return availabilities;
    }
}
