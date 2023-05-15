package in.ineuron.comp;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {
	
	private String name;
	private String address;
	private String[] skills;
	private List<String>qua;
	
	
	
	public void setQua(List<String> qua) {
		this.qua = qua;
	}
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	public void setAddress(String address) {
		System.out.println("Employee.setAddress()");
		this.address = address;
	}
	public void setSkills(String[] skills) {
		System.out.println("Employee.setSkills()");
		this.skills = skills;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", skills=" + Arrays.toString(skills) + "]";
	}
	
	

}
