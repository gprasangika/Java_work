package mainservice;

public class BlueDart implements IDelivery {

    public String delivered(double amount) {
        return "Order delivered through Blue Dart and amount paid is " + amount;
    }
}
