package ����ģʽ;


/**
 * ����ʽ
 * @author ������1999
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
