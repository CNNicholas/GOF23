package 单例模式;
/**
 * 静态内部类实现单例 最好方法
 * @author 朱致宇1999
 *
 */
public class Dome3 {
	
	private static class goujian{ //静态内部类
		private final static Dome3 dome = new Dome3();
	}
	private Dome3(){
		
	}
	public Dome3 getDome() {
		return goujian.dome;
	}
}
