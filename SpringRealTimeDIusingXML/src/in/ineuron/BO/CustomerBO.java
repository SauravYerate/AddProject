package in.ineuron.BO;

public class CustomerBO {

	
	private String customerName;
	private String customerAddress;
	private float pamt;
	private float rate;
	private float time;
	
	
	private double si;


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public void setPamt(float pamt) {
		this.pamt = pamt;
	}


	public void setRate(float rate) {
		this.rate = rate;
	}


	public void setTime(float time) {
		this.time = time;
	}


	public void setSi(double si) {
		this.si = si;
	}


	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", si=" + si + "]";
	}
	
	
	
	
}
