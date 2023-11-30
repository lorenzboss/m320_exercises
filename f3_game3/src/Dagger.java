import java.util.Random;

public class Dagger implements IWeapon {
    public int use(int ap) {
        Random random = new Random();

        int hit1 = random.nextInt(ap / 2);
        int hit2 = random.nextInt(ap / 2);
        return hit1 + hit2;
    }
}
