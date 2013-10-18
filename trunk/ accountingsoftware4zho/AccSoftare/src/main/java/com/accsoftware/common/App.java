package com.accsoftware.common;


import javax.swing.JOptionPane;
import com.accsoftware.ui.Table1Frame;


public class App 
{
    public static void main( String[] args ){
    	Table1Frame tbf = new Table1Frame();
    	try{	    	
	    	tbf.setVisible(true);
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(tbf, e.getMessage());
    	}
    }
}
