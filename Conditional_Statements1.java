package JavaPackage;

import java.util.Scanner;

public class Conditional_Statements1 {

	public static void main(String[] args) {

		System.out.println("Enter the month number");
		Scanner r= new Scanner(System.in);
		int month= r.nextInt();
	
		if(month==1)
		 {
		System.out.println("january");
		  
		 }
		 else if(month==2)
		 {
			 System.out.println("February"); 
		 }
		 else if(month==3)
		 {
			 System.out.println("March"); 
		 }
			 else if(month==4)
			 {
				 System.out.println("April"); 
			 }
			 else if(month==5)
			 {
				 System.out.println("May"); 
			 }
			 else if(month==6)
			 {
				 System.out.println("June"); 
			 }
			 else if(month==7)
			 {
				 System.out.println("July"); 
			 }
			 else if(month==8)
			 {
				 System.out.println("August"); 
			 }
			 else if(month==9)
			 {
				 System.out.println("september"); 
			 }
			 else if(month==10)
			 {
				 System.out.println("October"); 
			 }
			 else if(month==11)
			 {
				 System.out.println("November"); 
			 }
			 else
			 {
				 System.out.println("December");
			 }


		r.close();
	}
}


