package in.ineuron.Controller;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.Bean.Employee;

public class TestApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
		
		System.out.println("CONTAINER STARTED");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println("BEAN ID IS"+context.getBeanDefinitionCount());
	
		
		Employee employee = context.getBean(Employee.class);
		
		
		
		System.out.println(employee);
		
		context.close();
		
		
		
		

	}

}
