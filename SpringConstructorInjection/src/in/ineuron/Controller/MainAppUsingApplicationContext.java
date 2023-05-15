package in.ineuron.Controller;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.Bean.WishMessageGenerator;

public class MainAppUsingApplicationContext {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
		
		WishMessageGenerator wmg = context.getBean("wmg",WishMessageGenerator.class);
		System.in.read();
		
		String result = wmg.wishMessage("SAURAV");
		
		System.out.println(result);
		
		context.close();
		

	}

}
