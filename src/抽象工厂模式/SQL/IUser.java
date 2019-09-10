package 抽象工厂模式.SQL;

public interface IUser {
	void Insert(User user);
	
	User getUser(int id);
}
