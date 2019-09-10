package 抽象工厂模式.SQL;

public class MySQLUser implements IUser{
	@Override
	public void Insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��MYSQL�и�User�����Ӽ�¼");
	}
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��MYSQL�и���id�õ���һ����¼");
		return null;
	}
}
