package in.ineuron.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.ineuron.dto.PanCard;
import in.ineuron.dto.Person;

public class PersonDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("saurav");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void addUser(Person person)
	{
		et.begin();
		em.persist(person);
		et.commit();
		
	}
	
	public void updateUser(Person person) {
	    if (person != null) {
	        // Find the entity by panid
	        Person person1 = em.find(Person.class, person.getPid());

	        
	        et.begin();
	        // Update the fields if the entity exists
	        if (person1 != null) {
	            person1.setPname(person.getPname());
	            // set other fields to update here
               
	            // Persist the changes to the database
	            em.merge(person1);
	            et.commit();
	        }
	    }
	}
	
	public void delete(int pid)
	{
		Person person = em.find(Person.class, pid);
		et.begin();
		em.remove(person);
		et.commit();
		
	}
	
	public void getUser(int pid)
	{
		Person person = em.find(Person.class, pid);
		System.out.println(person);
	}

}
