package 抽象工厂模式.SQL;

public class MySQLType implements IType{
	@Override
	public void Insert(Type type) {
		// TODO Auto-generated method stub
		System.out.println("��MYSQL���ݿ��и�type������һ����¼");
	}
	@Override
	public User getType(int id) {
		// TODO Auto-generated method stub
		System.out.println("��MYSQL���ݿ����id�õ�TYPE��һ����¼");
		return null;
	}
}
