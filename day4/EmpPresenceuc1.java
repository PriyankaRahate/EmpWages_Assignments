package day4;

public class EmpPresenceuc1 {

	public static void main(String[] args) {
		int fulltime=1;
		 
		 double empcheck=Math.floor(Math.random()*10)%2;
		 if(empcheck == fulltime)
		 {
			 System.out.println("Employee is present");
			
		 }
		 else {
			 System.out.println("Employee is absent");
		 }

		}

	}


