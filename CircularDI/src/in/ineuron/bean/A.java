package in.ineuron.bean;

public class A {
	
	private B b;
	
	static
	{
		System.out.println("A.CLASS FILE IS LOAING");
	}

	public A() {
		super();
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	
	public A(B b) {
		super();
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	

}
