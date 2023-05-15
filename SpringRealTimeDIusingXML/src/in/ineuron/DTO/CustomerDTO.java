package in.ineuron.DTO;

public class CustomerDTO {
	
	
	

	private String customerName;
	private String customerAddress;
	private float pamt;
	private float rate;
	private float time;
	
	
	
	
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
	
	
	@Override
	public String toString() {
		return "CustomerDTO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + "]";
	}
	
	
	
	
	
	
	
	
	

}
