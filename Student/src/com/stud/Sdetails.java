package com.stud;

public class Sdetails extends Abstract {
	   @Override
	   public Student getStudent(String stud){    
	      if(stud.equalsIgnoreCase("clg")){
	         return new Clg();         
	      }else if(stud.equalsIgnoreCase("fsd")){
	         return new Batch();
	      }	 
	      return null;
	   }
	}
