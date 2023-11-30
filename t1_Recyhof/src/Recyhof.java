import java.util.ArrayList;

public class Recyhof {
    private ArrayList<Abfall> abfaelle = new ArrayList<>();

    public void addAbfall(Abfall abfall) {
        abfaelle.add(abfall);
    }

    public double getMetallwert() {
        double wert = 0;
        for (int i = 0; i < abfaelle.size(); i++) {
            if (abfaelle.get(i).isMetall()) {
                wert += abfaelle.get(i).getWert();
            }
        }
        return wert;
    }

    public double getGesamtwert() {
        double wert = 0;
        for (int i = 0; i < abfaelle.size(); i++) {
            wert += abfaelle.get(i).getWert();
        }
        return wert;
    }
}
