public class MusikCD extends Medium {

    private String interpret;
    private int anzLieder;
    private double ausleihgebuehr = 1;

    public MusikCD(String name, boolean ausgeliehen, String interpret, int anzLieder) {
        super(name, ausgeliehen);

        this.interpret = interpret;
        this.anzLieder = anzLieder;
    }

    public void printInformation(){
        super.printInformation();
        System.out.println("Interpret : " + interpret);
        System.out.println("Anzahl Lieder : " + anzLieder);
        System.out.println("Ausleihgebühr : " + ausleihgebuehr);
        System.out.println();
    }

    @Override
    public double getGebuhren() {
        return ausleihgebuehr;
    }
}
