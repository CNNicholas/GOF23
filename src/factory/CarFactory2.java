package factory;
/**
 * 简单工厂类
 * @author 朱致宇1999
 *
 */

public class CarFactory2 {
	
	public static  Car createAudi(){
		return new Audi();
	}
	public static  Car createByd(){
		return new Byd();
	}
	
}
