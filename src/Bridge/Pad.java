package Bridge;

public class Pad implements Computer{
	private Brand brand;
	public Pad(Brand brand) {
		this.brand = brand;
	}
	@Override
	public void sale() {
		brand.sale();
		System.out.println("Æ½°åµçÄÔ");
	}
}
