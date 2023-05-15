package in.ineuron.Bean;

import java.util.Date;

public class PersonInfo {
	
	private int pid;
	private String pname;
	private String paddress;
	
	private Date dom;
	private Date doj;
	private Date dob;
	
	
	
	
	public PersonInfo(int pid, String pname, String paddress, Date dom, Date doj, Date dob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dom = dom;
		this.doj = doj;
		this.dob = dob;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dom=" + dom + ", doj="
				+ doj + ", dob=" + dob + "]";
	}
	
	
	

}
