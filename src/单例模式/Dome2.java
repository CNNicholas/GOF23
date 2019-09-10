package 单例模式;


/**
 * 懒汉式
 * @author 朱致宇1999
 *
 */
public class Dome2 {
	private static Dome2 d;
	
	private Dome2() {
		
	}
	public static synchronized Dome2 getDome() {
		if(d==null) {
			d = new Dome2();
		}
		return d;
	}
}
