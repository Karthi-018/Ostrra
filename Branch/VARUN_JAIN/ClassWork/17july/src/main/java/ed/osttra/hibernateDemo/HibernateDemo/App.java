package ed.osttra.hibernateDemo.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ed.osttra.hibernateDemo.HibernateDemo.dao.Grade;
import ed.osttra.hibernateDemo.HibernateDemo.dao.SchoolLib;
import ed.osttra.hibernateDemo.HibernateDemo.dao.Student;

class App 
{
    public static void main(String args[]) {
    	
    	SchoolLib book1 = new SchoolLib(1,"XYZ","ABC");
    	SchoolLib book2 = new SchoolLib(2,"ABC","XYZ");

    	Grade g = new Grade(1,"A",80);
    	List<SchoolLib> ls = new ArrayList<>();
    	ls.add(book1);
    	ls.add(book2);
    	Student s= new Student(5,"Vidhi",95,g,ls );
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Grade.class).addAnnotatedClass(SchoolLib.class);
        
        SessionFactory sfactory = config.buildSessionFactory();
        
        Session sess=sfactory.openSession();
        Transaction tx =sess.beginTransaction();
        sess.save(book1);
        sess.save(book2);
        sess.save(g);
        sess.save(s);
        
        tx.commit();
    }
    
}
