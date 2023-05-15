package in.ineuron.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.ineuron.dto.Student;

public class StudentDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sachin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void addUser(Student student)
	{
		et.begin();
		
		em.persist(student);
		
		et.commit();
		
	}
	public void updateUser(Student student) {
	    if (student != null) {
	        // Find the entity by panid
	    	Student student1= em.find(Student.class, student.getSid());
	        et.begin();
	        // Update the fields if the entity exists
	        if (student1 != null) {
	        	student.setSname(student.getSname());
	            // set other fields to update here
              
	            // Persist the changes to the database
	            em.merge(student);
	            et.commit();
	        }
	    }
	   
	    
	}
	
public void delete(int sid)
{
	Student pancard = em.find(Student.class,sid);
	et.begin();
	em.remove(pancard);
	et.commit();
	
}


public void getUser(int pid)
{
	Student person = em.find(Student.class, pid);
	System.out.println(person);
}

        
	
	

}
