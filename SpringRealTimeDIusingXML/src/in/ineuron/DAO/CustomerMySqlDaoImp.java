package in.ineuron.DAO;




import javax.sql.DataSource;

import in.ineuron.BO.CustomerBO;

public class CustomerMySqlDaoImp implements IcustomerDAO{

	
	private DataSource dataSource;
	
	@Override
	public String processCustomer(CustomerBO bo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public CustomerMySqlDaoImp(DataSource dataSource) {
	     this.dataSource = dataSource;
	}

}
