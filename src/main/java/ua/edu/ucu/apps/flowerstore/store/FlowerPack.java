package ua.edu.ucu.apps.flowerstore.store;


import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity < 1 ? 1 : quantity;
    }
    double getPrice(){
        return flower.getPrice() * quantity;
    }
}
