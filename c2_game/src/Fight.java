import java.util.Random;

public class Fight {
    private int counter;
    private Character player1;
    private Character player2;

    public Fight(Character player1, Character player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private int attackDamadge(Character player) {
        Random random = new Random();
        int damadge = random.nextInt(player.getAp());
        return damadge;
    }

    private int attack(Character playerX, Character playerY) {
        counter++;
        int attackDamadge = attackDamadge(playerX);
        System.out.println("ROUND: " + counter);
        System.out.println(playerX.getName() + " hits " + playerY.getName() + " whith " + attackDamadge);
        playerY.setHp(playerY.getHp() - attackDamadge);
        if (playerY.getHp() - attackDamadge < 0) playerY.setHp(0);

        System.out.println(playerX.getName() + " : " + playerX.getHp() + " hp");
        System.out.println(playerY.getName() + " : " + playerY.getHp() + " hp");
        System.out.println("------------\n");

        if (playerY.getHp() == 0) {
            winner(playerX);
        }

        return playerY.getHp();
    }

    public void startFight() {
        while (player1.getHp() > 0 && player2.getHp() > 0) {
            player2.setHp(attack(player1, player2));

            if (player2.getHp() > 0) {
                player1.setHp(attack(player2, player1));
            }
        }
    }

    private void winner(Character winner) {
        System.out.println("The winner is: " + winner.getName());
    }
}
