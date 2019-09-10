package 装饰模式;

public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("天上飞！");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
	
}