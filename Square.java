//IF:WAP to accept a no from user and display a square if no is divisible by 5.

import java.util.*;

class Square{
	public static void main (String args[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int res=n*n;
		
		
		if(n % 5 == 0)
            System.out.println(n+" is divisible by 5!!\n"+res);
		else
            System.out.println(n+" is not divisible by 5");
	}
}
