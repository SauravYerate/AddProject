package in.ineuron.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Model.Student;
import in.ineuron.util.HibernateUtil;

public class MainApp1 {
	public static void main(String[] args) {
		
		
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		
		try {
		session=HibernateUtil.getsession();
		
		if(session!=null)
		{
		            transaction = session.getTransaction();
		            
		            if(transaction!=null)
		            {
		            	transaction.begin();
		            	
		            	Student student = new Student();
		            	student.setSid(1);
		            	student.setSname("SACHIN");
		            	student.setSaddress("MI");
		            	student.setAvg(3);
		            	
		            	session.persist(student);
		            	
		            	flag=true;
		            	
		            }
		            
		}
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			if(flag)
			{
				transaction.commit();
			}
			else {
				transaction.rollback();
			}
			
		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
		
		
	}

}
