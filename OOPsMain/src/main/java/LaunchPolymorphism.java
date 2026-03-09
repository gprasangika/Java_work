abstract class AeroPlane {

    public abstract void takeoff();

    public abstract void fly();

    public void landing() {
        System.out.println("AeroPlane is landing");
    }
}

class CargoPlane extends AeroPlane {
    public void takeoff() {
        System.out.println("Cargo Plane requires longer runway to take off");
    }

    public void fly() {
        System.out.println("Cargo Plane flies at lower height");
    }

}

class FighterPlane extends AeroPlane {

    public void takeoff() {
        System.out.println("Fighter Plane requires shoter runway to take off");
    }

    public void fly() {
        System.out.println("Fighter Plane flies at higher height");
    }

}

class CommercialPlane extends AeroPlane {

    public void takeoff() {
        System.out.println("CommercialPlane requires mid size runway to take off");
    }

    public void fly() {
        System.out.println("CommercialPlane flies at medium height");
    }

}

class Airport {
    public void permit(AeroPlane aero) {

        aero.takeoff();
        aero.fly();
    }
}

public class LaunchPolymorphism {

    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        CommercialPlane cp1 = new CommercialPlane();

        Airport airport = new Airport();
        airport.permit(cp);
        airport.permit(fp);
        airport.permit(cp1);


//        AeroPlane aero;
//
//        aero = cp;
//        aero.takeoff();
//        aero.fly();
//
//        System.out.println("***********************************");
//
//        aero = fp;
//
//        aero.takeoff();
//        aero.fly();
    }
}
