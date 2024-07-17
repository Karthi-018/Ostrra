package test.osttra.testdemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import test.osttra.dao.Grade;
import test.osttra.dao.Library;
import test.osttra.dao.Student;

public class App {
  public static void main(String[] args) {
	  Grade g = new Grade(1, "A", 80);
	  List<Library> l = new ArrayList<Library>();
	  Library l1 = new Library(1,"ABC", "acc");
	  Library l2 = new Library(1,"EFG", "aoo");
	  Library l3 = new Library(1,"XYZ", "app");
	  
	  l.add(l1);
	  l.add(l2);
	  l.add(l3);
	  Student s = new Student(1, "IJK" , 100, g, l);
	  
	  Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Grade.class).addAnnotatedClass(Library.class);

	  SessionFactory sf = config.buildSessionFactory();
	  Session sc = sf.openSession();
	  Transaction tx = sc.beginTransaction();
	  sc.save(s);
	  sc.save(g);
	  sc.save(l1);
	  sc.save(l2);
	  sc.save(l3);
	  tx.commit();
  }
}
