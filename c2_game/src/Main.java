public class Main {
    public static void main(String[] args) {

        Character character1 = new Character("Kevin", 100, 20);
        Character character2 = new Character("Laura",50, 40);

        Fight fight1 = new Fight(character1, character2);

        fight1.startFight();
    }
}