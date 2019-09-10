package 单例模式;
/**
 * 饿汉式
 * @author 朱致宇1999
 *
 */
public class Dome1 {
	private static final Dome1 d = new Dome1();
	
	private Dome1() {
		
	}
	public static Dome1 getDome() {
		return d;
	}
}
