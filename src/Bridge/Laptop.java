package Bridge;

public class Laptop implements Computer{

	private Brand brand;
	public Laptop(Brand brand) {
		this.brand = brand;
	}
	@Override
	public void sale() {
		brand.sale();
		System.out.println("±Ê¼Ç±¾");
	}
}