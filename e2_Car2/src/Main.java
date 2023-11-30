import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Ist nicht wichtig, ob Car oder xxxCar ist, weil die addCar Methode sowieso einen Car Typ erwartet
        Car testAuto1 = new UsedCar("Tesla", 100000, 500);
        Car testAuto2 = new CrashedCar("Tesla", 100000, 0);


        UsedCar test1 = new UsedCar("Tesla", 100000, 500);
        CrashedCar test2 = new CrashedCar("Tesla", 100000, 0);

        Fleet fleet = new Fleet();
        fleet.addCar(testAuto1);
        fleet.addCar(testAuto2);

        fleet.print();
    }
}