public class Main {
    public static void main(String[] args) {

        Competition competition = new Competition("Rotsee Regatta");

        Ship ship1 = new Ship(1, "Alinghi");
        Ship ship2 = new Ship(2, "Red Baron");
        Ship ship3 = new Ship(3, "Blue Lagoon");
        Ship ship4 = new Ship(4, "cooles Schiff");
        Ship ship5 = new Ship(5, "Dampfschiff");

        competition.addShip(ship1);
        competition.addShip(ship2);
        competition.addShip(ship3);
        competition.addShip(ship4);

        Person person1 = new Person("Lorenz", "Boss", "Basel");
        Person person2 = new Person("Cem", "Akkaya", "Zürlich");
        Person person3 = new Person("Levin", "Fankhauser", "Genf");

        ship1.setOwner(person1);
        ship2.setOwner(person2);

        competition.start();

        competition.printResult();
    }
}
