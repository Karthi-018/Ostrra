package com.jul17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Grade g=new Grade(2,"A");
        Grade g2=new Grade(3,"B");
        Student s1=new Student(2,"def",g,null);
        Student s2=new Student(3,"a",g2,null);
        Library l1=new Library(1, "book1", "auth1", s1);        
        Library l2=new Library(2, "book2", "auth1", s1);        
        Library l3=new Library(3, "book3", "auth1", s2);        
        Configuration cf=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Grade.class).addAnnotatedClass(Library.class);

        SessionFactory sf=cf.buildSessionFactory();
        Session sess=sf.openSession();
        sess.beginTransaction();
        sess.persist(g);
        sess.persist(g2);
        sess.persist(s1);
        sess.persist(s2);
        // sess.persist(l1);
        // sess.persist(l2);
        // sess.persist(l3);
        sess.getTransaction().commit();
    }
}
