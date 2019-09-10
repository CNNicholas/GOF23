package factory;

/**
 * 简单工厂情况下
 * @author 朱致宇1999
 *
 */
public class Client02 {   //调用者
	
	public static void main(String[] args) {
		Car c1 =CarFactory2.createAudi();//CarFactory2
		Car c2 = CarFactory.createCar("比亚迪");//CarFactory
		
		c1.run();
		c2.run();
		
	}
}
