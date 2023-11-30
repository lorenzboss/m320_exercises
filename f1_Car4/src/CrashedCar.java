public class CrashedCar extends Car {
    private int damageLevel;

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    public double getPrice() {
        return switch (damageLevel) {
            case 0 -> super.price * 0.9;
            case 1 -> super.price * 0.5;
            case 2 -> super.price * 0.0;
            default -> -1;
        };
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
