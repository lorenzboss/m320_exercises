public class Main {
    public static void main(String[] args) {
        Car testAuto1 = new UsedCar("Tesla", 100000, 1000);
        Car testAuto2 = new CrashedCar("Tesla", 100000, 1);
        // Car testAuto3 = new MobilityCar("Tesla", 100000, 10);

        Fleet fleet = new Fleet();
        fleet.addCar(testAuto1);
        fleet.addCar(testAuto2);
        // fleet.addCar(testAuto3);

        fleet.print();
    }
}