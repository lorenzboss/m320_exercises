import java.util.ArrayList;
import java.util.Random;

public class Competition {
    private ArrayList<Character> players = new ArrayList<>();

    public void addPlayer(Character player) {
        players.add(player);
    }

    public void start() {
        printPlayers();

        for( int i = 1 ; players.size() > 1 ; i++) {
            updateToMaxHp();

            Random random = new Random();
            Character player1 = players.get(random.nextInt(players.size()));
            Character player2 = players.get(random.nextInt(players.size()));

            while (player1.equals(player2)) {
                player2 = players.get(random.nextInt(players.size()));
            }

            System.out.println(i + " FIGHT: " + player1.getName() + " vs " + player2.getName() + "\n\n");

            Fight fight = new Fight(player1, player2);
            fight.startFight();

            players.remove(fight.getLooser());
        }
        System.out.println("THE WINNER OF THIS COMPETITION IS: " + players.get(0).getName());
    }

    private void updateToMaxHp() {
        for (Character player : players) {
            player.setHp(player.getMaxHp());
        }
    }

    private void printPlayers() {
        System.out.println("The participants in this competition are: ");
        for (Character player : players) {
            System.out.println(player.getName() + ": " + player.getHp() + " HP, " + player.getAp() + " AP");
        }
        System.out.println("\n\n");
    }
}
