package adapter;
/**
 * 适配器
 * @author 朱致宇1999
 *
 */
public class Adapter implements Target {
	private KeyBoard keyboard;
	
	@Override
	public void outline() {
		keyboard.request();
	}
	public Adapter(KeyBoard keyboard){	//构造方法
		this.keyboard = keyboard;
	}
	public Adapter() {
		
	}
	
}
