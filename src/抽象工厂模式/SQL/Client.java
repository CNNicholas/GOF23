package 抽象工厂模式.SQL;

public class Client {
	public static void main(String[] args) {
		User user = new User();
		Type type = new Type();
		
		IFactory factory= new MySQLFactory();
		
		IUser iu = factory.CreateUser();
		
		iu.Insert(user);
		iu.getUser(1);
		
		IType it = factory.CreateType();
		it.Insert(type);
		it.getType(1);
	}
}
