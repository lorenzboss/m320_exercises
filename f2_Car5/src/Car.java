import java.beans.FeatureDescriptor;
import java.util.Locale;

public abstract class Car {
    private String model;
    protected double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    protected abstract double getPrice();

    public String getModel() {
        return model;
    }

    public String getModel(boolean capsLock) {
        if (capsLock) {
            return model.toUpperCase(Locale.ROOT);
        } else return model;
    }
}
