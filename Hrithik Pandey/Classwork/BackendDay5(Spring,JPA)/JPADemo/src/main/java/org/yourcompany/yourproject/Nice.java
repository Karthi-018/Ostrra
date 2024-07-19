package org.yourcompany.yourproject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Nice {
  public static void main(String[] args) {
      emp e = new emp(4, "Kaadu");
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
      EntityManager em= emf.createEntityManager();
      em.getTransaction().begin();
      em.persist(e);
      em.getTransaction().commit();
      System.out.println(em.find(emp.class, 3));
    }
}
