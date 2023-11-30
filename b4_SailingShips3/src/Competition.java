import java.util.Arrays;
import java.util.Comparator;

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

        Arrays.sort(this.ships, Comparator.nullsLast(Comparator.comparing(Ship::getTime)));

        for (int i = 0; i < 5; i++) {
            if (ships[i] != null) {
                System.out.print("Nummer: " + ships[i].getNumber());
                System.out.print(" Name: " + ships[i].getName());
                System.out.print(" Zeit: " + ships[i].getFormattedTime());
                if (ships[i].getOwner() != null) {
                    System.out.print(" Besitzer: " + ships[i].getOwner().getFirstname());
                }
                System.out.println();
            }
        }
    }
}
