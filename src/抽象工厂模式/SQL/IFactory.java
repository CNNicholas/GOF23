package 抽象工厂模式.SQL;

public interface IFactory {
	IUser CreateUser();
	IType CreateType();
}
