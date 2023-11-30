import java.util.Random;

public class Axe implements IWeapon {
    public int use(int ap) {
        Random random = new Random();
        return random.nextInt(ap);
    }
}
