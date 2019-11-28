package com.ustglobal.jpawithhibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToMany {
	public static void main(String[] args) {

		Course c = new Course();
		c.setCid(1);
		c.setCname("Java");

		Student s= new Student();
		s.setSid(10);
		s.setSname("manju");
		List<Course> l = new ArrayList<Course>();
		l.add(c);
		s.setCourses(l);
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s);
			System.out.println("Record Saved");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}
	}
}
