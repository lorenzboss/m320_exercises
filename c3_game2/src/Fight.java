import java.util.Random;

public class Fight {
    private int counter;
    private Character player1;
    private Character player2;
    private Character looser;

    public Fight(Character player1, Character player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private int attackDamage(Character player) {
        Random random = new Random();
        return random.nextInt(player.getAp());
    }

    private int attack(Character playerX, Character playerY) {
        counter++;
        int attackDamage = attackDamage(playerX);
        System.out.println("ROUND: " + counter);
        System.out.println(playerX.getName() + " hits " + playerY.getName() + " with " + attackDamage);
        playerY.setHp(playerY.getHp() - attackDamage);
        if (playerY.getHp() < 0) playerY.setHp(0);

        System.out.println(playerX.getName() + " : " + playerX.getHp() + " hp");
        System.out.println(playerY.getName() + " : " + playerY.getHp() + " hp");
        System.out.println("------------\n");

        if (playerY.getHp() == 0) {
            winner(playerX);
            looser = playerY;
        }

        return playerY.getHp();
    }

    public void startFight() {
        while (player1.getHp() > 0 && player2.getHp() > 0) {
            player2.setHp(attack(player1, player2));

            if (player2.getHp() > 0) player1.setHp(attack(player2, player1));
        }
    }

    private void winner(Character winner) {
        System.out.println("The winner is: " + winner.getName() + "\n\n\n");
    }
    public Character getLooser() {
        return looser;
    }
}
