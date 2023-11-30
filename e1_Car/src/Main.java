public class Main {
    public static void main(String[] args) {

        UsedCar testAuto1 = new UsedCar("Tesla", 100000, 20);
        System.out.println(testAuto1.getCarPrice());
        System.out.println(testAuto1.getPrice());


        CrashedCar testAuto2 = new CrashedCar("Tesla", 100000, 0);
        System.out.println(testAuto2.getCarPrice());
        System.out.println(testAuto2.getPrice());

    }
}