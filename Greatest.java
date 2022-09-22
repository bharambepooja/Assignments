//WAP to accept 5 no from user and find out the greatest.

import java.util.Scanner;

public class Greatest {
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 5 Number : ");
		 int n1,n2,n3,n4,n5;
		 n1=sc.nextInt();
		 n2=sc.nextInt();
		 n3=sc.nextInt();
		 n4=sc.nextInt();
		 n5=sc.nextInt();
		 
		 if( n1 >= n2 && n1 >= n3 && n1>=n4 && n1>=n5)
	            System.out.println(n1 + " is the largest number.");

	        else if (n2 >= n1 && n2 >= n3  && n2>=n4  && n2>=n5)
	            System.out.println(n2 + " is the largest number.");

	        else if (n3 >= n1 && n3 >= n2  && n3>=n4  && n3>=n5)
	            System.out.println(n3 + " is the largest number.");
		 
	        else if (n4 >= n1 && n4 >= n2  && n4>=n3  && n4>=n5)
	            System.out.println(n4 + " is the largest number.");
		 
	        else
	            System.out.println(n5 + " is the largest number.");
	}
}
