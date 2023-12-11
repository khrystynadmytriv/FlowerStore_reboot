package ua.edu.ucu.apps.flowerstore.payments;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public boolean pay() {
        System.out.println("Payment with credit card: ...");
        return true;
    }
}