public class Tester {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();

        Buch buch1 = new Buch("bestes Buch", false, "bester Autor", "bester Verlag", 100, "beste ISBN");
        Buch buch2 = new Buch("tolles Buch", true, "toller Autor", "toller Verlag", 100, "tolle ISBN");

        MusikCD musikCD1 = new MusikCD("beste CD", false, "bester Interpret", 10);
        MusikCD musikCD2 = new MusikCD("tolle CD", true, "toller Interpret", 10);

        FilmDVD filmDVD1 = new FilmDVD("beste DVD", false, "bester Ressigeur", 100);
        FilmDVD filmDVD2 = new FilmDVD("tolle DVD", true, "toller Ressigeur", 100);

        bibliothek.addMedium(buch1);
        bibliothek.addMedium(buch2);
        bibliothek.addMedium(musikCD1);
        bibliothek.addMedium(musikCD2);
        bibliothek.addMedium(filmDVD1);
        bibliothek.addMedium(filmDVD2);

        System.out.println("Alle Medien");
        bibliothek.showAllMedia();
        System.out.println("---------");

        System.out.println("Ausgeliehene Medien");
        bibliothek.showBorrowedMedia();
        System.out.println("---------");

        System.out.println("Summe der Ausleihgebühr");
        System.out.println(bibliothek.calcAusleihgebuehr());
    }
}
