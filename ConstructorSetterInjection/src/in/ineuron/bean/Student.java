package in.ineuron.bean;

public class Student {
	
	private Integer sid;
	private String sname;
	private String saddress;
	private Float avg;
	
	static {
		System.out.println("STUDENT.CLASS FILE IS LOADING");
	}
	
	
	
	
	public Student() {
		super();
	}


	public Student(Integer sid, String sname, String saddress, Float avg) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.avg = avg;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saadress=" + saddress + ", avg=" + avg + "]";
	}
	
	
	
	

}
