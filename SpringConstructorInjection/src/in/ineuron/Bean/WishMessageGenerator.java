package in.ineuron.Bean;

import java.util.Date;

public class WishMessageGenerator {
	
	static {
	System.out.println(" WishMessageGenerator.class file is loading.......");
	}
	
	private Date date;

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.class parameterized constructor is loading....");
		this.date = date;
	}
	
	public String wishMessage(String user)
	{
		int hour=date.getHours();
		
		if(hour<12)
		{
			System.out.println("GOOD MORNING");
		}
		else if(hour<16)
		{
			System.out.println("GOOD AFTERNNON");
		}
		else if(hour<20)
		{
			System.out.println("GOOD EVENING");
		}
		else {
			System.out.println("GOOD NIGHT");
		}
		return user;
	}
	
	
	

}
