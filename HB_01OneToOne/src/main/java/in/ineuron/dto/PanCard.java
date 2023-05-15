package in.ineuron.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class PanCard {
	
	private int pid;
	private int pno;
	
	
	@Id
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	
	
	@Override
	public String toString() {
		return "PanCard [pid=" + pid + ", pno=" + pno + "]";
	}
	
	

}
