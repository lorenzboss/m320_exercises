public class UsedCar extends Car {
    private int mileage;
    public UsedCar(String model, double price, int mileage) {
        super(model, price);
        this.mileage = mileage;
    }

    public double getPrice(){
        double newPrice = super.getPrice()-(mileage*(super.getPrice()*0.0005));
        if (newPrice < 0) return 0;
        else return newPrice;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
