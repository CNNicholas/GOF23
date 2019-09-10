package clone;

import java.util.Date;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date= new Date(12452835485L);
	
		Sheep s = new Sheep("clone",date);
		Sheep s2 = (Sheep) s.clone();
		
		date.setTime(316545632L); //更改clone时间，clone2时间不改变  
		System.out.println(date);
		//System.out.println(s);
		System.out.println(s.getName());
		System.out.println(s.getBorn());
		
		
		//date.setTime(316545632L);
		s2.setName("clone2");
		//System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBorn());
		
	}
}
