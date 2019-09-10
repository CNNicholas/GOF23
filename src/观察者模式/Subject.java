package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Subject{
	protected List<Observer> list = new ArrayList<Observer>();
	
	public void registerObserver(Observer s) {
		list.add(s);
		}
	
	public void removeObserver(Observer s) {
		list.remove(s);
		}
	public void notifyAllObserver() {
		for (Observer observer : list) {
			observer.updata(this);
		}
	}

}
