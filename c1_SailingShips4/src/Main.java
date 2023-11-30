public class Main {
    public static void main(String[] args) {

        Competition competition = new Competition("Rotsee Regatta");

        Ship ship1 = new Ship(1, "Laura");
        Ship ship2 = new Ship(2, "Felix");
        Ship ship3 = new Ship(3, "Kevin");

        competition.addShip(ship1);
        competition.addShip(ship2);
        competition.addShip(ship3);

        Person person1 = new Person("Lorenz", "Boss", "Basel");
        Person person2 = new Person("Cem", "Akkaya", "Zürlich");
        Person person3 = new Person("Levin", "Fankhauser", "Genf");
        Person person4 = new Person("Tobias", "Topp", "NewYork");

        ship1.setOwner(person1);
        ship2.setOwner(person2);
        ship3.setOwner(person3);

        competition.start();

        competition.printResult();
    }
}
