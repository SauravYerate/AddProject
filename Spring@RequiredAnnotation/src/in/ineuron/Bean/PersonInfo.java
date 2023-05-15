package in.ineuron.Bean;

import org.springframework.beans.factory.annotation.Required;

public class PersonInfo {
	
	private int pid;
	private String pname;
	private String paddress;
	
	
	
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	@Required
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	
	@Required
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	
	
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}
	
	
	
	
	

}
