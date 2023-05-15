package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component(value="wmg")

public class WishMessageGenerator {
	
	@Autowired(required = true)
	private LocalDateTime date;
	
	static {
		System.out.println(" WishMessageGenerator.class file is loading");
	}
	
	public  WishMessageGenerator()
	{
		System.out.println("WishMessageGenerato object is instantiated");
	}
	
	public String wishMessage(String user)
	{
		int hour=date.getHour();
		
		if(hour<12)
		{
			return "GOOD MORNING"+user;
		}else if(hour<16)
		{
			return "GOOD AFTERNNON"+user;
		}else if (hour<20){
			return "GOOD EVENING"+user;
		}
		else {
			return "GOOD NIGHT";
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}


	
	
	
	

}
