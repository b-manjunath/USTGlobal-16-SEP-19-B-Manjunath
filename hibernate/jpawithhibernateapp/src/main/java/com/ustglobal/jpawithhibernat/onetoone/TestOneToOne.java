package com.ustglobal.jpawithhibernat.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {
	public static void main(String[] args) {
		Votercard v = new Votercard();
		v.setName("ram");
		v.setVid(10);
		Person p = new Person();
		p.setId(1);
		p.setName("ram");
		p.setVotercard(v);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			
			Votercard votercard = entityManager.find(Votercard.class, 10);
			System.out.println(votercard.getPerson().getId());
			
			//entityManager.persist(p);
			System.out.println("Record saved");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
		entityManager.close();
		}

	}
}
