public abstract class Medium {

    private String name;

    private boolean entleihstatus;


    public Medium(String name, boolean ausgeliehen) {
        this.name = name;
        this.entleihstatus = ausgeliehen;
    }

    public boolean getEntleihstatus() {
        return entleihstatus;
    }

    public void setEntleihstatus(boolean entleihstatus) {
        this.entleihstatus = entleihstatus;
    }

    public void printInformation(){
        System.out.println("Name :" + name);
        System.out.println("Entliehen :" + entleihstatus);
    }

    public abstract double getGebuhren();
}
