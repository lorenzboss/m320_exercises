public class Main {

    public static void main(String[] args) {
        IWeapon axe = new Axe();
        IWeapon dagger = new Dagger();

        Character char1 = new Character("Zenturon", 100, 20, axe);
        Character char2 = new Character("Valarian", 100, 20);

        char2.setWeapon(dagger);

        Fight game = new Fight(char1, char2);
        game.fight();

        Character winner = game.getWinner();
        if (winner != null) {
            System.out.println(winner.getName() + " hat den Kampf gewonnen.");
        }
    }

}
