package 观察者模式;

public class ConcreteSubject extends Subject{
	private int state;
	
	public void setState(int state) {
		this.state = state;
		this.notifyAllObserver();
	}
	public int getState() {
		return state;
	}

}
