package in.ineuron.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.bean.A;
import in.ineuron.bean.B;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("APPLICATION CONTEXT CONTAINER STARTED");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
		
	    Object bean = context.getBean("a",A.class);
	   
	    
	    System.out.println(bean);
	   
         	    
	}

}
