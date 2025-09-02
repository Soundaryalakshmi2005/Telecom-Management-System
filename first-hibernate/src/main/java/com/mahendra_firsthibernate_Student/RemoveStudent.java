package com.mahendra_firsthibernate_Student;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class RemoveStudent {
		public static void main(String[] args) {
			
			//Step1
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("first");
			//Step2
			EntityManager em=emf.createEntityManager();
			//Step3
			EntityTransaction t=em.getTransaction();

			t.begin();
			Student s=em.find(Student.class, 1);
			if(s!=null) {
				em.remove(s);
			}
			else {
				System.out.println("Data is not found");
			}
			t.commit();
		}
	}

