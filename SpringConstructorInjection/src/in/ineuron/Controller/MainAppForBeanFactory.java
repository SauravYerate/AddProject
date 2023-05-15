package in.ineuron.Controller;

import java.io.IOException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.Bean.WishMessageGenerator;

public class MainAppForBeanFactory {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/ApplicationContext.xml");
		
		System.out.println("BEAN FACTORY CONTAINER STARTING");
		
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		System.out.println("BEAN FACTORY CONTAINER STARTED");
		
		System.in.read();
		
		WishMessageGenerator wmg = factory.getBean("wmg",WishMessageGenerator.class);
		
		String result = wmg.wishMessage("SACHIN");
		System.out.println(result);

	}

}
