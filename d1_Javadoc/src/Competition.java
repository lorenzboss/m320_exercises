/**
 * Creates a Competition
 * @version 1.0
 * @author Lorenz Boss
 */
public class Competition {

	private String name;
	private Ship[] ships = new Ship[5];

	/**
	 * Sets the name of the parameter as the name of the Object
	 * @param name name of the competition
	 */
	public Competition(String name) {
		this.name = name;
	}

	/**
	 * Starts the competition
	 */
	public void start() {

		for (Ship s : this.ships) {
			if (s != null) {
				s.race();
			}
		}
	}

	/**
	 * Adds a ship to the competition if there is a free spot
	 * @param ship the ship, that is added to the competition
	 */
	public void addShip(Ship ship) {
		for (int i = 0; i < ships.length; i++) {
			if (ships[i] == null) {
				ships[i] = ship;
				break;
			}
		}
	}

	/**
	 * Prints the result of the competition
	 */
	public void printResult() {
		System.out.println("Wettkampf: " + this.name);

		for (Ship s : this.ships) {
			if (s != null) {
				System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
			}
		}
	}
}
