package com.stud;

public class Main {

	public static void main(String[] args) {
		
		
	      
	      Abstract obj = Details.getdetails(true);

	      Student obj1 = obj.getStudent("Shan");
	      
	      obj1.display();

	      Student obj2 = obj.getStudent("Mathi");

	      obj2.display();
	      
	      Abstract abst = Details.getdetails(false);
	      
	      Student a = abst.getStudent("clg");
	      
	      a.display();
	      
	      Student a1 = abst.getStudent("fsd");

	      a1.display();
	 
	      
		
	}

}
