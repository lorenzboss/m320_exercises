/**
 * Creates a Ship Object
 * @author Lorenz Boss
 * @version 1.0
 */
public class Ship {

	private int nr;
	private String name;
	private int time;

	/**
	 * Sets the value for number and name
	 * @param nr number of the ship
	 * @param name number of the ship
	 */
	public Ship(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Generates a random time and saves it in the variable time
	 */
	public void race() {
		int min = 300;
		int max = 600;
		this.time = (int) (Math.random() * (max - min + 1)) + min;
	}
	
	public int getTime() {
		return time;
	}
	
}
