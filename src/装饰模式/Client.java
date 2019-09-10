package в╟йндёй╫;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		FlyCar fc = new FlyCar(new SwimCar(car));
		fc.move();
	}
}
