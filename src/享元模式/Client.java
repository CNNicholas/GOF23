package 享元模式;
/**
 * 解决资源占用严重
 * 给实力类，定义内部状态和外部状态，
 * 不同的只有外部状态，
 * 共享内部状态
 * @author 朱致宇1999
 *
 */

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");//通过工厂
		ChessFlyWeight chess3 = new ConcreteChess("黑色");   //创建方式不同，不通过工厂，不添加到HashMap
		System.out.println(chess1);
		System.out.println(chess2);
		System.out.println(chess3);
		
		System.out.println("增加外部状态的处理===========");
		chess1.display(new Coordinate(10, 10));
		chess2.display(new Coordinate(20, 20));
		chess3.display(new Coordinate(9,9));
		
		
	}
}
