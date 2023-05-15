package in.ineuron.comp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

	private String name;
	private String address;
	private String[] skills;
	private List<String>id;
	private Set<String>phoneNumbers;
	private Map<String,Objects>idDetails;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setSkills(String[] skills) {
		this.skills = skills;
	}


	public void setId(List<String> id) {
		this.id = id;
	}


	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	public void setIdDetails(Map<String, Objects> idDetails) {
		this.idDetails = idDetails;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", skills=" + Arrays.toString(skills) + "]";
	}
	
	
	
	
	
}
