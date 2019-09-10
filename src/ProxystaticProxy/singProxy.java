package ProxystaticProxy;

public class singProxy implements Star{
	private Star star;
	
	
	public singProxy(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void makeplan() {
		System.out.println("singProxy.makeplan()");
		
	}

	@Override
	public void sing() {
		star.sing();
		
	}

	@Override
	public void getMoney() {
		System.out.println("singProxy.getMoney()");
	}

}
