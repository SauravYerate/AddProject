package in.ineuron.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.Bean.WishMessageGenerator;

public class UsingSpringWithXMLBeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/ApplicationContext.xml");
	
	System.out.println("BEAN FACTORY CONTAINER STARTING.......");
	XmlBeanFactory factory = new XmlBeanFactory(resource);
	System.out.println("BEAN FACTORY CONTAINER STARTED");
	
	
	WishMessageGenerator wmg = (WishMessageGenerator)factory.getBean("wmg",WishMessageGenerator.class);
	System.out.println(wmg);
	
	String result=wmg.wishMessage("sachin");
	
	System.out.println(result);
	
	
	
	
		     
		
		
		
		
		

	}

}
