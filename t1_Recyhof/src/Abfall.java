public class Abfall {
    private boolean metall;
    private double kgPreis;
    private double kg;

    public Abfall(boolean metall, double kgPreis) {
        this.metall = metall;
        this.kgPreis = kgPreis;
    }


    public void setKg(double kg) {
        this.kg = kg;
    }

    public boolean isMetall() {
        return metall;
    }

    public double getWert(){
        return kg*kgPreis;
    }
}
