public class Main {
    public static void main(String[] args) {

        Character character1 = new Character("Luise",200, 10);
        Character character2 = new Character("Kevin",100, 20);
        Character character3 = new Character("Laura",50, 40);
        Character character4 = new Character("Denis",25, 80);

        Competition competition = new Competition();

        competition.addPlayer(character1);
        competition.addPlayer(character2);
        competition.addPlayer(character3);
        competition.addPlayer(character4);

        competition.start();
    }
}