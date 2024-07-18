package edu.training.osttra.hibDemo;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.training.demo.Grade;
import edu.training.demo.Library;
import edu.training.demo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Library> books = new ArrayList<Library>();
    	
        Library l = new Library(1,"xyz","a");
        Library l1 = new Library(2,"abc","b");
        
        books.add(l);
        books.add(l1);
        Grade g = new Grade(2,"A",90);
        List<Student> stu = new ArrayList<>();
        
        
        Student s=new Student(2,"Palak",90,g,books);
        Student s1 = new Student(3,"Ankit",100,g,books);
        stu.add(s);
        stu.add(s1);
        
        
        
        Configuration config =new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Grade.class).addAnnotatedClass(Library.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
        session.save(g);
        session.save(l);
        session.save(l1);
        tx.commit();
        
    }
}
