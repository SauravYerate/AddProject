package in.ineuron.Controller;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.Bean.Univ;

public class TestApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
		
		System.out.println("CONTAINER STARTED");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println("BEAN ID IS"+context.getBeanDefinitionCount());
		
		Univ clg = context.getBean("uni",Univ.class);
		
		
		System.out.println(clg);
		
		
		
		

	}

}
