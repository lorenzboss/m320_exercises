import org.w3c.dom.ls.LSOutput;

public class Tester {
    public static void main(String[] args) {
        Recyhof recyhof = new Recyhof();

        Abfall abfall1 = new Abfall(true, 10);
        abfall1.setKg(100);

        Abfall abfall2 = new Abfall(true, 10);
        abfall2.setKg(100);

        Abfall abfall3 = new Abfall(false, 10);
        abfall3.setKg(10);

        recyhof.addAbfall(abfall1);
        recyhof.addAbfall(abfall2);
        recyhof.addAbfall(abfall3);

        System.out.println(recyhof.getMetallwert());
        System.out.println(recyhof.getGesamtwert());

    }
}
