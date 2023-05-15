package in.ineuron.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.Controller.MainController;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		 reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		  
		  MainController controller = factory.getBean("customerController", MainController.class);
		  System.out.println(controller);
		  

	}

}
