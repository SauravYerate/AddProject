package in.ineuron.Bean;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class Univ {
	
	
	private Map<Integer ,String>faculty;
	private Map<String,Date>date;
	private Properties iplInfo;
	
	
	
	
	
	
	public void setIplInfo(Properties iplInfo) {
		this.iplInfo = iplInfo;
	}
	public void setFaculty(Map<Integer, String> faculty) {
		this.faculty = faculty;
	}
	public void setDate(Map<String, Date> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Univ [faculty=" + faculty + ", date=" + date + "]";
	}
	
	
	
	

}
