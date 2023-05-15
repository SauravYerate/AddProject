package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.bean.Flipkart;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		
		Flipkart flipkart = factory.getBean("fkrt",Flipkart.class);
		System.out.println(flipkart);
		
		
		String result=flipkart.doShopping(new String[] {"TISSOT","RY","CH"},new float[] {1000,1200,1400});
		System.out.println(result);

	}

}
