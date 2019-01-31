package com.stud;

public class Studetails extends Abstract {
	   @Override
	   public Student getStudent(String stud){    
	      if(stud.equalsIgnoreCase("Shan")){
	         return new Name();         
	      }else if(stud.equalsIgnoreCase("Mathi")){
	         return new Id();
	      }	 
	      return null;
	   }
	}
