package in.ineuron.comp;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component(value="voter")
@PropertySource(value="in/ineuron/commons/application.properties")
public class Voter {
	
	@Value("${voter.info.name}")
	private String name;
	
	@Value("${voter.info.age}")
	private int age;
	
	private Date dov;
	
	static {
		System.out.println("Voter.class file is loading");
	}

	public Voter() {
		super();
		System.out.println("Voter object got Instantiated");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("Voter.myInit()");
		dov = new Date();
		boolean flag = false;

		if (name == null) {
			System.out.println("Name must not be null");
			flag = true;
		}
		if (age < 0)
			age = age * -1;

		if (age > 100) {
			System.out.println("Age must not be > 100");
			flag = true;
		}
		if (flag)
			throw new IllegalArgumentException("Invalid inputs...");
		
	}
	public String checkVotingEligibilty()
	{
		if(age<18)
		
			System.out.println("MR/MRS." +name+"YOU ARE NOT ELIGIBLE FOR VOTING"+"---->"+dov);

			return "MR/MRS." +name+"YOU ARE  ELIGIBLE FOR VOTING"+"---->"+dov;
	}
	
    @PreDestroy
	public void myDestroy()
	{
		name=null;
		age=0;
		dov=null;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}
	
	

}
