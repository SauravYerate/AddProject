package in.ineuron.controller;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.Bean.WishMessageGenerator;

public class UsingSpringWithApplicationContext {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
	
	System.out.println("BEAN FACTORY CONTAINER STARTING.......");
	ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
	System.out.println("BEAN FACTORY CONTAINER STARTED");
	
	System.in.read();
	
	System.out.println(factory.getBeanDefinitionCount());
	System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
	
	
	WishMessageGenerator wmg = (WishMessageGenerator)factory.getBean("WishMessageGenerator",WishMessageGenerator.class);
	System.out.println(wmg);
	
	String result=wmg.wishMessage("sachin");
	
	System.out.println(result);
	
	System.out.println("****************");
	
	WishMessageGenerator wmg1 = (WishMessageGenerator)factory.getBean("wmg",WishMessageGenerator.class);
	System.out.println(wmg1);
	
	String result1=wmg1.wishMessage("KOHLI");
	
	System.out.println(result1);
	
	
	
	factory.close();
		     
		
		
		
		
		

	}

}
