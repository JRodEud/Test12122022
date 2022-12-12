package com.challenges.test12122022.Service;

import com.challenges.test12122022.models.Availability;
import com.challenges.test12122022.models.Capacity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private List<Availability> availabilityRepo = Arrays.asList(
            new Availability("Store001", "Prod1", new Date(2021, Calendar.FEBRUARY,19), 1.0),
            new Availability("Store001", "Prod1", new Date(2021, Calendar.FEBRUARY, 20), 3.0),
            new Availability("Store001", "Prod1", new Date(2021, Calendar.FEBRUARY, 21), 0));

    private List<Capacity> capacityRepo = Arrays.asList(
            new Capacity("Store001", "Prod1", new Date(2021,Calendar.FEBRUARY,19), 1.0),
            new Capacity("Store001", "Prod1", new Date(2021, Calendar.FEBRUARY, 20), 3.0),
            new Capacity("Store001", "Prod1", new Date(2021, Calendar.FEBRUARY, 21), 0));

    public List<Availability> getAvailability(String storeNo, Date date) {
        return availabilityRepo.stream()
                .filter(availability -> availability.getStoreNo().equals(storeNo) && availability.getDate().equals(date))
                .collect(Collectors.toList());
    }

    public List<Capacity> getCapacity(String storeNo, Date date) {
        return capacityRepo.stream()
                .filter(capacity -> capacity.getStoreNo().equals(storeNo) && capacity.getDate().equals(date))
                .collect(Collectors.toList());
    }
}
