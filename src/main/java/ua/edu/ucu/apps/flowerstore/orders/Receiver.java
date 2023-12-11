package ua.edu.ucu.apps.flowerstore.orders;

public class Receiver implements User {
    @Override
    public void update(Status status){
        System.out.println("Receiver status of the order is"+status);
    }
}
