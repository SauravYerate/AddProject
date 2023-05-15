package in.ineuron.Test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.bean.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("Bean count is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is    :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("\n" + wmg);

		factory.close();

	}

}
