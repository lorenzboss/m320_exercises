import java.beans.FeatureDescriptor;
import java.util.Locale;

public class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }
    protected double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getModel(boolean capsLock){
        if (capsLock){
            return model.toUpperCase(Locale.ROOT);
        }
        else return model;
    }
}
