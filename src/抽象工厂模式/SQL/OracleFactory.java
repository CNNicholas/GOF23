package 抽象工厂模式.SQL;
public class OracleFactory implements IFactory{
	@Override
	public IType CreateType() {
		// TODO Auto-generated method stub
		return  new OracleType();
	}
	@Override
	public IUser CreateUser() {
		// TODO Auto-generated method stub
		return  new OracleUser();
	}
}
