package in.ineuron.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int pid;
	private String pname;
	private String paddress;
	
	
	@OneToOne
	private PanCard pancard;



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public String getPaddress() {
		return paddress;
	}



	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}



	public PanCard getPancard() {
		return pancard;
	}



	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}



	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", pancard=" + pancard + "]";
	}
	
	
	

}
