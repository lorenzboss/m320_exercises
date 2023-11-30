public class Competition {
    private String name;

    private Ship[] ships = new Ship[5];

    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addShip(Ship ship) {
        for (int i = 0; i < 5; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }
    }

    public void start() {
        for (int i = 0; i < 5; i++) {
            if (ships[i] != null) {
                ships[i].race();
            }
        }


    }

    public void printResult() {
        System.out.println("Wettkampf: " + this.getName());

        for (int i = 0; i < 5; i++) {
            if (ships[i] != null) {
                System.out.print("Nummer: " + ships[i].getNumber());
                System.out.print(" Name: " + ships[i].getName());
                System.out.println(" Zeit: " + ships[i].getTime());
            }
        }
    }
}
