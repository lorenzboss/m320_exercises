import java.util.Random;

public class Ship {
    private int number;
    private String name;
    private int time;
    private String formattedTime;

    private Person owner;

    public Ship(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void race() {
        Random random = new Random();
        this.time = random.nextInt(301) + 300;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    private void formattedTime() {
        int h1 = time / 3600;
        int m1 = time % 3600 / 60;
        int s1 = time % 60;

        String h2 = String.format("%02d", h1);
        String m2 = String.format("%02d", m1);
        String s2 = String.format("%02d", s1);

        formattedTime = (h2 + ":" + m2 + ":" + s2);
    }

    public String getFormattedTime() {
        formattedTime();
        return formattedTime;
    }
}
