package Bridge;
public class Desktop implements Computer{
	private Brand brand;
	public Desktop(Brand brand) {
		this.brand = brand;
	}
	@Override
	public void sale() {
		brand.sale();
		System.out.println("Ì¨Ê½»ú");
	}
}