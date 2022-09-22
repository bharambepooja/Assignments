//WAP to accept age from user and chech eligble for voting or not.


import java.util.*;
class Voting{
	public static void main (String args[]){
		int age;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Age : ");
		age = sc.nextInt();
		
	if(age < 18)
		System.out.println("You Cannot Vote!!!!");
	else
		System.out.println("You Can Vote!!!! ");
}
}
