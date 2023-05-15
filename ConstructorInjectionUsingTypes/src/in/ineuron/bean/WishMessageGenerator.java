package in.ineuron.bean;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	
	static {
		
		System.out.println(" WishMessageGenerator.class File is loading");
	}

	public WishMessageGenerator(Date date) {
		super();
		this.date = date;
	}

	public WishMessageGenerator() {
		super();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
	

}
