package 装饰模式;
public class Car implements ICar{
	@Override
	public void move() {
		System.out.println("车在陆地上开");
	}
}