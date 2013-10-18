package com.accsoftware.common;

import com.accsoftware.ui.Table1Frame;


public class App 
{
    public static void main( String[] args ){
    	Table1Frame tbf = new Table1Frame();
    	try{	 
    		
	    	tbf.setVisible(true);
	    
    	}catch(Exception e){
//    		TODO: JOptionPane.showMessageDialog(tbf, e.getMessage());
    		e.printStackTrace();
    	}
    }
}
