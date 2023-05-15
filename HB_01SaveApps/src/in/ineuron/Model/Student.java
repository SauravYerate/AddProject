package in.ineuron.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stud")
public class Student {
	
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname",length=20)
	private String sname;
	@Column(name="saddress",length=20)
	private String saddress;
	@Column(name="avg")
	private float avg;
	
	static {
		System.out.println("STUDENT.CLASS FILE IS LOADING");
	}

	public Student() {
	System.out.println("STUDENT.CLASS OBJECT IS INSTANTIATED");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", avg=" + avg + "]";
	}
	
	
	
	

}
