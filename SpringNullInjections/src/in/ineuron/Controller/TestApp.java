package in.ineuron.Controller;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.Bean.MarksInfo;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
		
		System.out.println("CONTAINER STARTED");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println("BEAN ID IS"+context.getBeanDefinitionCount());
		
		MarksInfo marksInfo = context.getBean("marks",MarksInfo.class);
		
		System.out.println("MARKS INFORMATION ARE"+marksInfo);
		
		

	}

}
