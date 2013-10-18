package com.accsoftware.util;


import java.util.List;

import org.hibernate.Session;

import com.accsoftware.common.Table1;
import com.accsoftware.common.Table2;
import com.accsoftware.persistence.HibernateUtil;

public class DataHandler {
	
	
	
	// Create method
	public static void addRecord(Table1 record){
		if(validValue(record)) throw new IllegalArgumentException("You cannot type Have Empty Value"); 
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		  
        session.beginTransaction();		
        session.save(record);
        session.getTransaction().commit();
	}
	
	public static void addRecord(Table2 record){
		if(validValue(record)) throw new IllegalArgumentException("You cannot type Have Empty Value"); 
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		  
        session.beginTransaction();		
        session.save(record);
        session.getTransaction().commit();
	}
	
	private static boolean validValue(Table1 record){	
		
		return !(record.getItem() != null && record.getDate() != null
				&& record.getFee() != null && record.getGst() != null);
	}
	
	private static boolean validValue(Table2 record){	
		
		return !(record.getItem() != null && record.getDate() != null
				&& record.getFee() != null && record.getGst() != null);
	}
	
	
	//Read method	
	@SuppressWarnings("unchecked")
	public static List<Object> readAll(Object table){
		String tname = table instanceof Table1?"Table1":"Table2";
		String hql = "from " + tname;
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Object> result = session.createQuery(hql).list();
		return result;
	}
}
