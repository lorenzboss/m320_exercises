/**
 * Start of the Application with the main method
 */
public class Start {

	/**
	 * Main-Method, starts the application and creates a new competition, new Ships and starts the competition
	 * @see Competition  (creats a new competition)
	 * @see Ship (creats new ship)
	 * @see Competition#addShip(Ship)  (adds ship to the competition)
	 * @see Competition#start()  (starts the competition)
	 */
	public static void main(String[] args) {
		
		Competition c = new Competition("Rotsee Regatta");
		
		Ship ship1 = new Ship(1, "Alinghi");
		Ship ship2 = new Ship(2, "Red Baron");
		Ship ship3 = new Ship(3, "Blue Lagoon");
		
		c.addShip(ship1);
		c.addShip(ship2);
		c.addShip(ship3);
		
		c.start();
	
		c.printResult();
	}	
}