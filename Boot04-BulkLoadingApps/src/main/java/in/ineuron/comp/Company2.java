package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.info")

public class Company2 {
	
	private String cname;
	private String cloc;
	private String csize;
	
	
	
	static {
		System.out.println("Company2.class file is loading...");
	}
	
	
	
	public Company2() {
		System.out.println("Company2 object is instantiated...");
	}
	
	public void setCname(String cname) {
		System.out.println("Company2.setCname()");
		this.cname = cname;
	}
	public void setCloc(String cloc) {
		System.out.println("Company2.setCloc()");
		this.cloc = cloc;
	}
	public void setCsize(String csize) {
		System.out.println("Company2.setCsize()");
		this.csize = csize;
	}
	
	
	
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", cloc=" + cloc + ", csize=" + csize +"]";
	}

	
	
	
	
	
}
