package in.ineuron.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import in.ineuron.dao.SchoolDao;
import in.ineuron.dao.StudentDao;
import in.ineuron.dto.School;
import in.ineuron.dto.Student;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("PLEASE PROVIDE YOUR OPTIONS");
		System.out.println("1.insertUser  2.updateUser  3.deleteUser  4.selectUser");
		int option=sc.nextInt();
		
		
		
		
		if(option==1)
			
		{
			
			Student student =new Student();
			student.setSname("SACHIN");
			student.setSaddress("MI");
			
			
			Student student1 =new Student();
			student1.setSname("SKY");
			student1.setSaddress("MI");
			
			Student student2 =new Student();
			student2.setSname("SACHIN");
			student2.setSaddress("MI");
			
			List<Student>al=new ArrayList<Student>();
			al.add(student);
			al.add(student1);
			al.add(student2);
			
			School school = new School();
			school.setSname("DJ");
			school.setSaddress("pune");
			school.setStudents(al);
			
			StudentDao dao=new StudentDao();
			dao.addUser(student);
			dao.addUser(student1);
			dao.addUser(student2);
			
			SchoolDao dao1=new SchoolDao();
			dao1.addUser(school);
		
			
		
			
			
			
		}
	
		
		else if(option==2) {
		    System.out.println("ENTER THE ID TO BE UPDATED");
		    int sid=sc.nextInt();
		    
		    StudentDao dao=new StudentDao();
		    System.out.println("ENTER NAME NO TO BE UPDATED");
		    String sName=sc.next();
		    Student Student=new Student();
		  
		    Student.setSname(sName); // Set the PAN number of the Student object
		    dao.updateUser(Student);
		    
		    SchoolDao dao1=new SchoolDao();
		    System.out.println("ENTER School ID TO BE UPDATED");
		    int sid1=sc.nextInt();
		    System.out.println("ENTER School NAME TO BE UPDATED");
		    String sname=sc.next();
		    School School=new School();
		    
		    School.setSname(sname); // Set the name of the School object
		    dao1.updateUser(School);
		}
	}
//
//		else if(option==3)
//		{
//			System.out.println("ENTER YOUR ID TO BE DELETED IN School");
//			 int id1=sc.nextInt();
//			 SchoolDao dao1=new SchoolDao();
//			 dao1.delete(id1);
//			
//			 
//			 
//			System.out.println("please provide your id");
//			int id=sc.nextInt();
//			 Student Student=new Student();
//			 StudentDao dao=new StudentDao();
//			 dao.delete(id);
//			 
//			 
//			 
//			
//		}
//		else if(option==4)
//		{
//			System.out.println("please provide your id");
//			int id=sc.nextInt();
//			 Student Student=new Student();
//			 StudentDao dao=new StudentDao();
//			 dao.getUser(id);
//			 
//			 
//			 System.out.println("ENTER YOUR ID TO BE DELETED IN School");
//			 int id1=sc.nextInt();
//			 SchoolDao dao1=new SchoolDao();
//			 dao1.getUser(id1);
//			
//			
//		}
//
//	}

}
