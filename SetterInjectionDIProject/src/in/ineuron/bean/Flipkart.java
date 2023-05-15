package in.ineuron.bean;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	private float discount;
	
	private Courier courier;
	
	static
	{
		System.out.println("Flipkart.enclosing_method()");
	}

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
		
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String doShopping(String[]items,float[]prices)
	{
		int oid=0;
		float billAmt=0.0f;
		
		for(float price: prices)
		{
			billAmt+=price;
		}
		
		Random random=null;
		
		
		random=new Random();
		oid=random.nextInt(1000);
		System.out.println("order id is::"+oid);
		
		String msg=courier.deleiver(oid);
		System.out.println("Flipkart.doShopping()");
		return Arrays.toString(items) +"are having prices"+Arrays.toString(prices)+"BILL AMOUNT IS "+ (billAmt) +"msg"+msg;
	}

	@Override
	public String toString() {
		return "Flipkart [discount=" + discount + ", courier=" + courier + "]";
	}
	
	

}
