package Bridge;
/**
 * 桥接模式
 * @author 朱致宇1999
 *
 */
public class Client {
	public static void main(String[] args) {
		//出售dell台式机
		Computer c = new Pad(new Lenovo());
		c.sale();
		//出售Lenovo笔记本
		Computer c1 = new Pad(new ShenZhou());
		c1.sale();

	}
}
