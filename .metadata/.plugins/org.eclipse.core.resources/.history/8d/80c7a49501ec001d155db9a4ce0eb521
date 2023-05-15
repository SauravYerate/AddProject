package in.ineuron.Controller;

import java.util.Scanner;

import in.ineuron.dao.PanCardDao;
import in.ineuron.dao.PersonDao;
import in.ineuron.dto.PanCard;
import in.ineuron.dto.Person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("PLEASE PROVIDE YOUR OPTIONS");
		System.out.println("1.insertUser  2.updateUser  3.deleteUser  4.selectUser");
		int option=sc.nextInt();
		
		
		
		
		if(option==1)
			
		{
			
			PanCard pan=new PanCard();
			pan.setPid(1);
			pan.setPno(12345);
			
			Person person=new Person();
			person.setPid(1);
			person.setPname("SAURAV");
			person.setPaddress("PUNE");
			person.setPancard(pan);
			
			PanCardDao dao=new PanCardDao();
			dao.addUser(pan);
			
			PersonDao dao1=new PersonDao();
			dao1.addUser(person);
			
			
			
		}
		
		else if(option==2) {
		    System.out.println("ENTER THE ID TO BE UPDATED");
		    int pid=sc.nextInt();
		    
		    PanCardDao dao=new PanCardDao();
		    System.out.println("ENTER PAN NO TO BE UPDATED");
		    int pNo=sc.nextInt();
		    PanCard pancard=new PanCard();
		    pancard.setPid(pid); // Set the ID of the PanCard object
		    pancard.setPno(pNo); // Set the PAN number of the PanCard object
		    dao.updateUser(pancard);
		    
		    PersonDao dao1=new PersonDao();
		    System.out.println("ENTER PERSON ID TO BE UPDATED");
		    int Pid=sc.nextInt();
		    System.out.println("ENTER PERSON NAME TO BE UPDATED");
		    String pname=sc.next();
		    Person person=new Person();
		    person.setPid(Pid); // Set the ID of the Person object
		    person.setPname(pname); // Set the name of the Person object
		    dao1.updateUser(person);
		}

		else if(option==3)
		{
			System.out.println("ENTER YOUR ID TO BE DELETED IN PERSON");
			 int id1=sc.nextInt();
			 PersonDao dao1=new PersonDao();
			 dao1.delete(id1);
			
			 
			 
			System.out.println("please provide your id");
			int id=sc.nextInt();
			 PanCard pancard=new PanCard();
			 PanCardDao dao=new PanCardDao();
			 dao.delete(id);
			 
			 
			 
			
		}
		else if(option==4)
		{
			System.out.println("please provide your id");
			int id=sc.nextInt();
			 PanCard pancard=new PanCard();
			 PanCardDao dao=new PanCardDao();
			 dao.getUser(id);
			 
			 
			 System.out.println("ENTER YOUR ID TO BE DELETED IN PERSON");
			 int id1=sc.nextInt();
			 PersonDao dao1=new PersonDao();
			 dao1.getUser(id1);
			
			
		}

	}

}
