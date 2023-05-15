package in.ineuron.Bean;

public class CarInfo {
	
	private String engno;
	private String mno;
	private String carNo;
	private String carId;
	private String model;
	private String ftype;
	
	

	
	
	public CarInfo(String engno, String mno, String carNo, String carId, String model, String ftype) {
		super();
		this.engno = engno;
		this.mno = mno;
		this.carNo = carNo;
		this.carId = carId;
		this.model = model;
		this.ftype = ftype;
	}





	@Override
	public String toString() {
		return "CarInfo [engno=" + engno + ", mno=" + mno + ", carNo=" + carNo + ", carId=" + carId + ", model=" + model
				+ ", ftype=" + ftype + "]";
	}
	
	
	
	

}
