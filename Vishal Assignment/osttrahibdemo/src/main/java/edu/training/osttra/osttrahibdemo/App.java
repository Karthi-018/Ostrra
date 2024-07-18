package edu.training.osttra.osttrahibdemo;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.training.osttra.osttrahibdemo.dao.Grade;
import edu.training.osttra.osttrahibdemo.dao.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Student s=new Student(1,"vishal",1001);
//    	s.setSid(1);
//    	s.setName("Vishal");
//    	s.setMarks(1001);
    	
//    	Grade g=new Grade(1,"A",80);
    	
    	
    	
    	Configuration config=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Grade.class);
    	
    	SessionFactory sf=config.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	Transaction tx= session.beginTransaction();
    	session.save(s);
//    	session.save(g);
    	tx.commit();
    	
    	
    	
    }
}
