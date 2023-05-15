package in.ineuron.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("APPLICATION CONTEXT CONTAINER STARTED");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
		
		Student student = context.getBean("std1",Student.class);
		System.out.println(student);
		
		
		Student student2 = context.getBean("std2",Student.class);
		System.out.println(student2);
		
		Student student3 = context.getBean("std3",Student.class);
		System.out.println(student3);
	}

}
