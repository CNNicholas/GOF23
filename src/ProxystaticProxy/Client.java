package ProxystaticProxy;

public class Client {

	public static void main(String[] args) {
		singStar s = new singStar();
		
		singProxy p = new singProxy(s);

		p.makeplan();
		p.sing();
		p.getMoney();
	}

}
