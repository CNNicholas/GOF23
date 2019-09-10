package 抽象工厂模式.SQL;

public interface IType {
	void Insert(Type type);
	
	User getType(int id);
}
