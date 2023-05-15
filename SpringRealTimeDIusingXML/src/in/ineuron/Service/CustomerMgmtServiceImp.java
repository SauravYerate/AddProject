package in.ineuron.Service;

import in.ineuron.DAO.IcustomerDAO;
import in.ineuron.DTO.CustomerDTO;

public class CustomerMgmtServiceImp  implements ICustomerMgmntService{

	
	 IcustomerDAO dao;
	 
	public CustomerMgmtServiceImp(IcustomerDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String calculateSI(CustomerDTO dto) throws Exception {
		
		return null;
	}
	
	

}
