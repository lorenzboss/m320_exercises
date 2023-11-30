public class Buch extends Medium {

    private String autor;
    private String verlag;
    private int anzhalSeiten;
    private String isbn;

    public Buch(String name, boolean ausgeliehen, String autor, String verlag, int anzhalSeiten, String isbn) {
        super(name, ausgeliehen);

        this.autor = autor;
        this.verlag = verlag;
        this.anzhalSeiten = anzhalSeiten;
        this.isbn = isbn;
    }

    public void printInformation(){
        super.printInformation();
        System.out.println("Autor : " + autor);
        System.out.println("Verlag : " + verlag);
        System.out.println("Anzahl Seiten : " + anzhalSeiten);
        System.out.println("ISBN : " + isbn);
        System.out.println();
    }

    @Override
    public double getGebuhren() {
        return 0;
    }
}
