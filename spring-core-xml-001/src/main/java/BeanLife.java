
public class BeanLife {
	static {
		System.out.println("class loading");
	}
	{
		System.out.println("instantiation");
	}
	public void myInit() {
		System.out.println("initialization");
	}
	public void myDestroy() {
		System.out.println("deinstantiation");
	}
	

}
