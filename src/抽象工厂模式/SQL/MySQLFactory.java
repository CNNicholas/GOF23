package 抽象工厂模式.SQL;

public class MySQLFactory implements IFactory{
	@Override
	public IType CreateType() {
		// TODO Auto-generated method stub
		return  new MySQLType();
	}
	@Override
	public IUser CreateUser() {
		// TODO Auto-generated method stub
		return  new MySQLUser();
	}
}
