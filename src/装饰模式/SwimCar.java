package װ��ģʽ;

public class SwimCar extends SuperCar{
	public SwimCar(ICar car) {
		super(car);
	}
	public void swim() {
		System.out.println("��ˮ����");
	}
	@Override
	public void move() {
		super.move();
		swim();
	}
}
