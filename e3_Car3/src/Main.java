public class Main {
    public static void main(String[] args) {
        Car testAuto1 = new UsedCar("Tesla", 100000, 1000);
        Car testAuto2 = new CrashedCar("Tesla", 100000, 1);

        Fleet fleet = new Fleet();
        fleet.addCar(testAuto1);
        fleet.addCar(testAuto2);

        System.out.println(testAuto1.getModel());
        System.out.println(testAuto1.getModel(true));
        System.out.println(testAuto1.getModel(false));
    }
}