public class FilmDVD extends Medium {

    private String regisseur;
    private int laufzeit;
    private double ausleihgebuehr = 2;

    public FilmDVD(String name, boolean ausgeliehen, String regisseur, int laufzeit) {
        super(name, ausgeliehen);

        this.regisseur = regisseur;
        this.laufzeit = laufzeit;
    }

    public void printInformation(){
        super.printInformation();
        System.out.println("Regisseur : " + regisseur);
        System.out.println("Laufzeit : " + laufzeit);
        System.out.println("Ausleihgebühr : " + ausleihgebuehr);
        System.out.println();
    }

    @Override
    public double getGebuhren() {
        return ausleihgebuehr;
    }
}
