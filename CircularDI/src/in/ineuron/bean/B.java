package in.ineuron.bean;

public class B {
	
	private A a;
	
	static {
		System.out.println("B.CLASS FILE IS LOADING");
	}
	public B()
	{
		System.out.println("B OBJECT IS INSTANTIATED");
	}
	
	
	public B(A a) {
		super();
		this.a = a;
	}


	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
	

}
