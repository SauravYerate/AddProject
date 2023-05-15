package in.ineuron.Controller;

import in.ineuron.Service.ICustomerMgmntService;
import in.ineuron.VO.CustomerVO;

public class MainController {
	
	ICustomerMgmntService service;

	public MainController(ICustomerMgmntService service) {
		super();
		this.service = service;
	}
	
	public int saveUser(CustomerVO vo) {
		
		
		return 0;
		
	}

}
