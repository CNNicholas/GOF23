package ����ģʽ;
/**
 * ��̬�ڲ���ʵ�ֵ��� ��÷���
 * @author ������1999
 *
 */
public class Dome3 {
	
	private static class goujian{ //��̬�ڲ���
		private final static Dome3 dome = new Dome3();
	}
	private Dome3(){
		
	}
	public Dome3 getDome() {
		return goujian.dome;
	}
}
