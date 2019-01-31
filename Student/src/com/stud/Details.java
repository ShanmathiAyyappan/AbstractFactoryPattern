package com.stud;

public class Details {
	   public static Abstract getdetails(boolean bol){   
	      if(bol){
	         return new Studetails();         
	      }else{
	         return new Sdetails();
	      }
	   }
	}