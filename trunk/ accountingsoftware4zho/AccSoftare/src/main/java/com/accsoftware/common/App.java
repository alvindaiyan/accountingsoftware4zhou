package com.accsoftware.common;

import java.sql.Date;

import org.hibernate.Session;

import com.accsoftware.persistence.HibernateUtil;


public class App 
{
    public static void main( String[] args ){
    	 System.out.println("Maven + Hibernate + MySQL");
         Session session = HibernateUtil.getSessionFactory().openSession();
  
         session.beginTransaction();
         Table1 table1 = new Table1();
         table1.setDate(new Date(2013, 8, 3));
         table1.setItem("stationery");
         table1.setFee(26.79);
         table1.setGst(3.59);
         table1.setStationary(23.3);
         
  
         session.save(table1);
         session.getTransaction().commit();
    }
}
