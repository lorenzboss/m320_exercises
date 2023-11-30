public class Auto {
    private double verbrauch = 5.0;
    private double tankvolumen = 50.0;
    private double tankinhalt = 0.0;

    public void tanken(double liter) {
        if (tankinhalt + liter <= tankvolumen) {
            tankinhalt += liter;
        }
    }

    public void fahren(double km) {
        double reichweite = tankinhalt * 100.0 / verbrauch;
        if (reichweite >= km) {
            tankinhalt -= km / 100.0 * verbrauch;
        }
    }

    public double getTankinhalt() {
        return tankinhalt;
    }
}