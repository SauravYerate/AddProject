package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="org.info")

public class Company1 {
	
	private String cname;
	private String cloc;
	private String csize;
	
	
	
	static {
		System.out.println("Company1.class file is loading...");
	}
	
	
	
	public Company1() {
		System.out.println("Company1 object is instantiated...");
	}
	
	public void setCname(String cname) {
		System.out.println("Company1.setCname()");
		this.cname = cname;
	}
	public void setCloc(String cloc) {
		System.out.println("Company1.setCloc()");
		this.cloc = cloc;
	}
	public void setCsize(String csize) {
		System.out.println("Company1.setCsize()");
		this.csize = csize;
	}
	
	
	
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", cloc=" + cloc + ", csize=" + csize + "]";
	}

	
	
	
	
	
}
