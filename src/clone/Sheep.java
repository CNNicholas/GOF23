package clone;

import java.util.Date;
/**
 * 深克隆
 * @author 朱致宇1999
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
		Object obj = super.clone();//主要是super，继承Object的clone方法
		
		Sheep s = (Sheep)obj;
		s.born = (Date) this.born.clone();  //deep clone
		
		return obj;
	}
}
