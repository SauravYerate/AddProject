package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMessageGenerator;

public class ClientApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Bean id information :: " + Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context);
		System.in.read();
		
		
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		String message = wmg.wishMessage("SACHIN");
		
		System.out.println(message);
		
		((AbstractApplicationContext) context).close();
	}
}
