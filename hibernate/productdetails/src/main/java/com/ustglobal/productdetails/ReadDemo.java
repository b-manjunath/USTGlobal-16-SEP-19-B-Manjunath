package com.ustglobal.productdetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.productdetails.dto.ProductDetails;


public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("record presented");
		ProductDetails productDetail = entityManager.find(ProductDetails.class, 1);
		System.out.println("Id is :"+productDetail.getId());
		System.out.println("Name is :"+productDetail.getName());
		System.out.println("Quality is:"+productDetail.getPrice());


	}// end of main method

	
	
	
}
