package main;


import mainservice.BlueDart;
import mainservice.FedEx;

public class LaunchSpring {

    public static void main(String[] args) {

    Mynthra m = new Mynthra(new FedEx());

    m.setDelivery(new BlueDart());

    String status = m.orderDelivery(76528.5);

    System.out.println(status);
//    System.out.println(m.orderDelivery(20000));





    }
}
