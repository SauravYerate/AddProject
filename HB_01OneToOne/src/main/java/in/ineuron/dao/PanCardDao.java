package in.ineuron.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.ineuron.dto.PanCard;
import in.ineuron.dto.Person;

public class PanCardDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("saurav");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void addUser(PanCard pancard)
	{
		et.begin();
		
		em.persist(pancard);
		
		et.commit();
		
	}
	public void updateUser(PanCard pancard) {
	    if (pancard != null) {
	        // Find the entity by panid
	        PanCard entity= em.find(PanCard.class, pancard.getPid());
	        et.begin();
	        // Update the fields if the entity exists
	        if (entity != null) {
	        	entity.setPno(pancard.getPno());
	            // set other fields to update here
              
	            // Persist the changes to the database
	            em.merge(entity);
	            et.commit();
	        }
	    }
	   
	    
	}
	
public void delete(int pid)
{
	PanCard pancard = em.find(PanCard.class,pid);
	et.begin();
	em.remove(pancard);
	et.commit();
	
}


public void getUser(int pid)
{
	PanCard person = em.find(PanCard.class, pid);
	System.out.println(person);
}

        
	
	

}
