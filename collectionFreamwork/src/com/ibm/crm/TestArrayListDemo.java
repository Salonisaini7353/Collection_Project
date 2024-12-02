package com.ibm.crm;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListDemo {
	public static void main(String[] args) {
		
		      String stringObj1 = new String("Rajan");
		      String stringObj2 = new String("Seema"); 
		      String stringObj3 = new String("Shalu");
		      String stringObj4 = new String("Tannu");
		      
		        ArrayList arrayListobj = new ArrayList();
		        arrayListobj.add(stringObj1);
                arrayListobj.add(stringObj2);
	             arrayListobj.add(stringObj3);
	             arrayListobj.add(stringObj4);
	             System.out.println("size of the Array List " +arrayListobj.size() );
	             
	             Iterator iteratorobj = arrayListobj.iterator();
	             
	             while (iteratorobj.hasNext()) {
	            	String stringobj =(String)iteratorobj.next();
	            	System.out.println(stringobj);
	             }  
	}
	public ArrayList getNameOfEmployee(){
		 String stringObj1 = new String("Rajan");
	      String stringObj2 = new String("Seema");
	      String stringObj3 = new String("Shalu");
	      String stringObj4 = new String("Tannu");
	      
	      ArrayList arrayListobj = new ArrayList();
	      arrayListobj.add(stringObj1);
          arrayListobj.add(stringObj2);
           arrayListobj.add(stringObj3);
           arrayListobj.add(stringObj4);
		return arrayListobj;
	}
	}
					
				
	