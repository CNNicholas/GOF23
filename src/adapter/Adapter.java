package adapter;
/**
 * ������
 * @author ������1999
 *
 */
public class Adapter implements Target {
	private KeyBoard keyboard;
	
	@Override
	public void outline() {
		keyboard.request();
	}
	public Adapter(KeyBoard keyboard){	//���췽��
		this.keyboard = keyboard;
	}
	public Adapter() {
		
	}
	
}
