package com.example.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Configuration cf = new Configuration().configure().addAnnotatedClass(intern.class).addAnnotatedClass(ceo.class);
      SessionFactory sf= cf.buildSessionFactory();
      Session s = sf.openSession();
      intern i= s.get(intern.class, 1);
      // for (ceo x : i.getC()) {
      //   System.out.println("ceos"+x.getCeoID());
      // }
      Query q = s.createQuery("select ceoID,interns from ceo");
      List<Object[]> ls= q.getResultList();
      for (Object[] ceo : ls) {
        System.out.println(ceo[0]+" "+ceo[1]);
      }
      //   intern i1= new intern();
      //   intern i2= new intern();
      //   intern i3= new intern();
      //   List<ceo> ceos= new ArrayList<>();
      //   List<ceo> ceos2= new ArrayList<>();
      //   List<intern> listofIntern= new ArrayList<>();
      //   List<intern> listofIntern2= new ArrayList<>();
      //   ceo c1= new ceo();
      //   ceo c2= new ceo();
      //   ceo c3= new ceo();
      //   listofIntern.add(i1);
      //   listofIntern.add(i2);
      //   listofIntern2.add(i3);
      //   c1.setCeoID(12);
      //   c2.setCeoID(13);
      //   c3.setCeoID(14);
      //   c1.setInterns(listofIntern);
      //   c2.setInterns(listofIntern);
      //   c3.setInterns(listofIntern2);
      //   ceos.add(c1);
      //   ceos.add(c2);
      //   ceos2.add(c3);
      //   i1.setC(ceos);
      //   i2.setC(ceos);
      //   i3.setC(ceos2);
      //   i1.setInternID(1);
      //   i2.setInternID(2);
      //   i3.setInternID(3);
      // s.beginTransaction();  
      // s.persist(c1);
      // s.persist(c2);
      // s.persist(c3);
      // s.persist(i1);
      // s.persist(i2);
      // s.persist(i3);
      // s.getTransaction().commit();
    }
}
