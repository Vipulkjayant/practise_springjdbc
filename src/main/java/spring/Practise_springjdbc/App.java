package spring.Practise_springjdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.UserDAO;
import Entiity.User;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
       UserDAO d=context.getBean("dao",UserDAO.class);      
       
       int i=0;
       while(i<100)
       {
       
       System.out.println("------------Select Operations you want to perform---------");
       System.out.println("1.Create 2.Update 3.Read 4.Delete");
       
       Scanner sc=new Scanner(System.in);
       String op=sc.nextLine();
       
       
       if(op.equals("create"))
       {   
    	 
    	System.out.println("Enter User id :");
    	int id=sc.nextInt();
    	sc.nextLine();
    	
    	System.out.println("Enter user name :");
    	String name=sc.nextLine();
    	
    	System.out.println("Enter user email :");
    	String email=sc.nextLine();
    	
    	System.out.println("Enter user city :");
    	String city=sc.nextLine();
    	
       User u=new User(id,name,email,city);
       int result=d.insert(u);
       System.out.println("Data successfully inserted with :"+result);
       System.out.println("-------------------------------------------------------------");
       }
       
       if(op.equals("update"))
       {
    	   System.out.println("Enter User id :");
       	int id=sc.nextInt();
       	sc.nextLine();
       	
       	System.out.println("Set new  name :");
       	String name=sc.nextLine();
       	
       	System.out.println("Set new email :");
       	String email=sc.nextLine();
       	
       	System.out.println("Change user city :");
       	String city=sc.nextLine();
       	
       	User u=new User(id,name,email,city);
        int result=	d.update(u);
        System.out.println("User successfully updated with"+result);
        System.out.println("---------------------------------------------------------------");
       }
       i++;
       }
    }
}
