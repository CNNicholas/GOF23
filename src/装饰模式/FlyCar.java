package װ��ģʽ;

public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("���Ϸɣ�");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
	
}