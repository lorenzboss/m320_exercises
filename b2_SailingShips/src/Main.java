public class Main {
    public static void main(String[] args) {

        Competition competition = new Competition("Rotsee Regatta");

        Ship ship1 = new Ship(1, "Alinghi");
        Ship ship2 = new Ship(2, "Red Baron");
        Ship ship3 = new Ship(2, "Blue Lagoon");

        competition.addShip(ship1);
        competition.addShip(ship2);
        competition.addShip(ship3);

        competition.start();

        competition.printResult();
    }
}
