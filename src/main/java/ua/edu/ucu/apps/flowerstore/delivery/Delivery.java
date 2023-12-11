package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.store.FlowerBucket;

public interface Delivery {
    // boolean deliver();

    void deliver(List<FlowerBucket> items);
}