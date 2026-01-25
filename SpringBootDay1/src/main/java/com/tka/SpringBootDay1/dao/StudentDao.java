package com.tka.SpringBootDay1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.SpringBootDay1.entity.Student;
@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory sf;
	
	public String insertdata(Student s ) {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(s);
		tr.commit();
		ss.close();
		return "Data Is Inserted...!";
	}

}
