package װ��ģʽ;

public class SuperCar implements ICar{
	protected ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	@Override
	public void move() {
		car.move();
		
	}
}
