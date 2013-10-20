package com.accsoftware.util;


import java.sql.Date;
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
	public static List<Object> readAll(String table, Date start, Date end){
		String hql = "from " + table + " where acc_date >= \'" + start
				+ "\' and acc_date <= \'" + end + "\' order by acc_date";
		System.out.println(hql);
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Object> result = session.createQuery(hql).list();
		return result;
	}
	
	
}
