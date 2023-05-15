package in.ineuron.Controller;

import java.io.IOException;
import java.util.Date;

import in.ineuron.Bean.WishMessageGenerator;

public class MainAppPureJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new java.util.Date();
		
		WishMessageGenerator wmg = new WishMessageGenerator(date);
		
		
		String result = wmg.wishMessage("SAURAV");
		System.out.println(result);

	}

}
