package adapter;
/**
 * 
 * @author ÖìÖÂÓî1999
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Client c = new Client();
		
		KeyBoard keyboard = new KeyBoard();
		
		Target t = new Adapter(keyboard);
		
		t.outline();
	}
}
