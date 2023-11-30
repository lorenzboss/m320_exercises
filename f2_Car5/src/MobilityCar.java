public class MobilityCar extends Car {

    private int days;

    public MobilityCar(String model, double price, int days) {
        super(model, price);
        this.days = days;
    }

    protected double getPrice() {
        return days * 72;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
