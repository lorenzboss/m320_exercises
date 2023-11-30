public class Character {
    private String name;
    private int hp;
    private int ap;
    private int maxHp;

    public Character(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
