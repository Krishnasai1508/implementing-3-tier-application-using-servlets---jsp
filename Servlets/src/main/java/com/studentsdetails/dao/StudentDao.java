package com.studentsdetails.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.studentsdetails.dto.Students_Details;

public class StudentDao {
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	
	//**************************Saving Data in DataBase*********************************
	
	public void saveStudentDetails(Students_Details students_dentails) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.persist(students_dentails);
		
		et.commit();
		
	}
	
	
	//*************************Get Student Details By Email ID***************************
	
	public Students_Details getStudentsDetails(String email_Id) {
		
		try {
			
			EntityManager em = emf.createEntityManager();
			
			Query q = em.createQuery("select s from students_details s where s.email_Id=?1");
			
			q.setParameter(1, email_Id);
			
			Students_Details students_Details = (Students_Details) q.getSingleResult();
			
			return students_Details;
			
		} catch (Throwable e) {
			
			return null;
			
		}
		
	}
	
	
	//********************************Get All Student Details******************************************
	
	public List<Students_Details> getAllStudentsDetails() {
		
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select s from students_details s");
		
		return q.getResultList();
		
	}
	
	
}
