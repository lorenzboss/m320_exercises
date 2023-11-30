import java.util.ArrayList;

public class Bibliothek {
    private ArrayList<Medium> medien = new ArrayList<>();

    public void addMedium(Medium m){
        medien.add(m);
    }

    public void showAllMedia(){
        for (Medium medium : medien) {
            medium.printInformation();
        }
    }

    public void showBorrowedMedia(){
        for (Medium medium : medien) {
            if (medium.getEntleihstatus()) {
                medium.printInformation();
            }
        }
    }

    public double calcAusleihgebuehr(){
        double wert = 0;
        for (Medium medium : medien) {
            if (medium.getEntleihstatus()){
            wert += medium.getGebuhren();
        }}
        return wert;
    }

}
