package ua.edu.ucu.apps.flowerstore.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket{
    private List<FlowerPack> flowerPacks = new ArrayList <>();
    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks){
            price += flowerPack.getPrice();
        }
        return price;
    }
    public void addFlowerPack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }
}
