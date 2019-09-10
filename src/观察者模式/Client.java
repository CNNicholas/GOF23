package 观察者模式;
/**
 * 自己实现观察者模式
 * @author 朱致宇1999
 *
 */
public class Client {
	public static void main(String[] args) {
		
		ConcreteSubject subject = new ConcreteSubject(); //创建目标对象
		
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		subject.registerObserver(obs1);		//添加
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		subject.setState(3000);//广播内容，所有观察者发生变化
		
		System.out.println(obs1.getMystate());//查看观察者状态
		System.out.println(obs2.getMystate());
		System.out.println(obs3.getMystate());
		subject.setState(1500);//广播内容，所有观察者发生变化
		
		System.out.println(obs1.getMystate());//查看观察者状态
		System.out.println(obs2.getMystate());
		System.out.println(obs3.getMystate());
	}
}
