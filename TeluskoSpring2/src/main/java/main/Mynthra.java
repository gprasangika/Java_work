package main;

import mainservice.IDelivery;

public class Mynthra {

    private IDelivery delivery;

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }

    public Mynthra(IDelivery delivery) {
        this.delivery = delivery;
    }

    public Mynthra() {
    }


    public String orderDelivery(double amount) {
        return delivery.delivered(amount);
    }
}
