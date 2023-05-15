package in.ineuron.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import in.ineuron.dto.School;

public class SchoolDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sachin");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void addUser(School school)
	{
		et.begin();
		em.persist(school);
		et.commit();
		
	}
	
	public void updateUser(School school) {
	    if (school != null) {
	        // Find the entity by panid
	        School school1 = em.find(School.class, school.getSid());

	        
	        et.begin();
	        // Update the fields if the entity exists
	        if (school1 != null) {
	            school.setSname(school.getSname());
	            // set other fields to update here
               
	            // Persist the changes to the database
	            em.merge(school);
	            et.commit();
	        }
	    }
	}
	
	public void delete(int pid)
	{
		School school = em.find(School.class, pid);
		et.begin();
		em.remove(school);
		et.commit();
		
	}
	
	public void getUser(int pid)
	{
		School school = em.find(School.class, pid);
		System.out.println(school);
	}

}
