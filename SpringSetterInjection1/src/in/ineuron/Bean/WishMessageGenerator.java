package in.ineuron.Bean;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	static {
		
		System.out.println("WishMessageGenerator.class file is loading");
	}
	
	public WishMessageGenerator()
	{
	System.out.println("WishMessageGenerator.class object is created");
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
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
		else
		{
			System.out.println("GOOD NIGHT");
		}
		
		return user;
		
	}
	

}
