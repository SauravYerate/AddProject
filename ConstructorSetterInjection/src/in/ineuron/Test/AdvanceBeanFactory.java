package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Student;

public class AdvanceBeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		int loadBeanDefinitions = reader.loadBeanDefinitions("in/ineuron/cfg/Applicationcontext.xml");
		
		Student student = factory.getBean("std1",Student.class);
		System.out.println(student);

	}

}
