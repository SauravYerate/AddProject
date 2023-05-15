package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;

@Service(value="service")
public class CustomerMgmtServiceImpl implements ICustomerMgmntService {

	@Autowired
	private ICustomerDAO dao;


	static {
		System.out.println("CustomerMgmtServiceImpl.CLASS FILE IS LOADING..");
	}
	
	

	public CustomerMgmtServiceImpl() {
		super();
		System.out.println("CustomerMgmtServiceImpl OBJECT IS CREATED...");
	}

	@Override
	public String calcuateSimpleInterest(CustomerDTO dto) throws Exception {

		float intrAmount = (dto.getPamt() * dto.getTime() * dto.getRate()) / 100.0f;

		CustomerBO customerBO = new CustomerBO();
		customerBO.setCustomerAddress(dto.getCustomerAddress());
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setPamt(dto.getPamt());
		customerBO.setTime(dto.getTime());
		customerBO.setRate(dto.getRate());
		customerBO.setIntrAmount(intrAmount);
		int count = dao.save(customerBO);

		return count == 0 ? "customer registration failed"
				: "customer registration succesfull---->SimpleInterestAmount::" + intrAmount;
	}

}
