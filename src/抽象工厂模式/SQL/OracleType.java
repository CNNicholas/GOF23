package 抽象工厂模式.SQL;

public class OracleType implements IType{
	@Override
	public void Insert(Type type) {
		// TODO Auto-generated method stub
		System.out.println("��Oracle���ݿ��и�type������һ����¼");
	}
	@Override
	public User getType(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Oracle���ݿ����id�õ�TYPE��һ����¼");
		return null;
	}
}
