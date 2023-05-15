package in.ineuron.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.Model.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Student student=new Student();
		student.setSid(1);
		student.setSname("SAURAV");
		student.setSaddress("MI");
		student.setAvg(3);
		
		session.save(student);
		transaction.commit();
		
		session.close();
		
		
		

	}

}
