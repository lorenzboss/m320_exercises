import java.util.ArrayList;
import java.util.Comparator;

public class Competition {
    private String name;

    private ArrayList<Ship> ships = new ArrayList<Ship>();

    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void start() {
        for (int i = 0; i < ships.size(); i++) {
            ships.get(i).race();
        }
    }

    public void printResult() {
        System.out.println("Wettkampf: " + this.getName());

        ships.sort(Comparator.nullsLast(Comparator.comparing(Ship::getTime)));

        for (int i = 0; i < ships.size(); i++) {
            System.out.print("Nummer: " + ships.get(i).getNumber() + ";  ");
            System.out.print(" Name: " + ships.get(i).getName() + ";  ");
            System.out.print(" Zeit: " + ships.get(i).getFormattedTime() + ";  ");
            if (ships.get(i).getOwner() != null) {
                System.out.print(" Besitzer: " + ships.get(i).getOwner().getFirstname() + ";  ");
            }
            System.out.println();
        }
    }
}
