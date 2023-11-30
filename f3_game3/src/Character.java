public class Character {

    private String name;
    private int hp; // health
    private int ap; // attack

    private IWeapon weapon;

    public Character(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public Character(String name, int hp, int ap, IWeapon weapon) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.weapon = weapon;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    private void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void attack(Character enemy) {

        if (weapon != null) {
            int hit = weapon.use(this.ap);
            enemy.setHp(enemy.getHp() - hit);

            System.out.println(this.name + " hit " + enemy.name + " with " + hit);
            this.log(this);
            this.log(enemy);
        } else {
            System.out.println(this.name + " has no weapon and cannot attack.");
            System.exit(0);
        }
    }

    private void log(Character character) {
        System.out.println(character.getName() + ": " + "hp=" + character.getHp());
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
