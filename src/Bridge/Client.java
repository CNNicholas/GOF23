package Bridge;
/**
 * �Ž�ģʽ
 * @author ������1999
 *
 */
public class Client {
	public static void main(String[] args) {
		//����dell̨ʽ��
		Computer c = new Pad(new Lenovo());
		c.sale();
		//����Lenovo�ʼǱ�
		Computer c1 = new Pad(new ShenZhou());
		c1.sale();

	}
}
