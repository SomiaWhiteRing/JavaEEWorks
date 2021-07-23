package work2;

public class asumbFactory {
	private static asumb beanInstance;
	
	public static asumb createBean(){
		beanInstance = new asumb(5,3);
		return beanInstance;
	}
}
