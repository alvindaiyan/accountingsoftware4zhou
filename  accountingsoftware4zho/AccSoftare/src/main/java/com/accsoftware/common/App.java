package com.accsoftware.common;

import java.sql.Date;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import com.accsoftware.persistence.HibernateUtil;
import com.accsoftware.ui.Table1Frame;
import com.accsoftware.util.DataHandler;


public class App 
{
    public static void main( String[] args ){
//    	 System.out.println("Maven + Hibernate + MySQL");
//         Table1 table1 = new Table1();
//         table1.setDate(new Date(2013, 8, 3));
//         table1.setItem("stationery");
//         table1.setFee(26.79);
//         table1.setGst(3.59);
//         table1.setStationary(23.3);
//
//         DataHandler.addRecord(table1);
    	Table1Frame tbf = new Table1Frame();
    	try{	    	
	    	tbf.setVisible(true);
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(tbf, e.getMessage());
    	}
    }
}
