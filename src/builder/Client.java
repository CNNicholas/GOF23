package builder;
public class Client {
	public static void main(String[] args) {
		
		AirShipDirector director = new MakeAirshipDirector(new MakeAirShipBuilder());

		AirShip ship = director.directAirShip();
		
		ship.launch();
	}
}

