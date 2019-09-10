package 观察者模式;

public class ObserverA implements Observer{
	private int mystate;
	
	@Override
	public void updata(Subject subject) {
		mystate =((ConcreteSubject) subject).getState();
	}
	public void setMystate(int mystate) {
		this.mystate = mystate;
	}
	public int getMystate() {
		return mystate;
	}
}
