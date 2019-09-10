package 装饰模式;

public class SwimCar extends SuperCar{
	public SwimCar(ICar car) {
		super(car);
	}
	public void swim() {
		System.out.println("在水里游");
	}
	@Override
	public void move() {
		super.move();
		swim();
	}
}
