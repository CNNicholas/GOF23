package clone;

import java.util.Date;
/**
 * ���¡
 * @author ������1999
 *
 */
public class Sheep implements Cloneable {
	private String name;
	private Date born;
	
	public Sheep(String name, Date born) {
		super();
		this.name = name;
		this.born = born;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();//��Ҫ��super���̳�Object��clone����
		
		Sheep s = (Sheep)obj;
		s.born = (Date) this.born.clone();  //deep clone
		
		return obj;
	}
}
