//WAP Accept choice from user and accordingly display the output 1:unary Operator  2:Ternary Operator  3:Binary Operator

import java.util.Scanner;

class Operator{
   public static void main(String args[]) {
 
      Scanner sc = new Scanner(System.in);
      System.out.println("1:Unary Operator");
      System.out.println("2:Ternary Operator");
      System.out.println("3:Binary operator");
      System.out.println("Enter a Choice:");
      int ch=sc.nextInt();
      
      switch(ch) 
      {
      case 1:
    	  System.out.println("Your are in Unary Operator!!");
    	  System.out.println("Enter a Number: ");
    	  int n=sc.nextInt();
    	 
    	  System.out.println(n++);  
    	  System.out.println(++n);
    	  System.out.println(n--);
    	  System.out.println(--n);
    	  break;
          
      case 2:
    	  System.out.println("Your are in Ternary Operator!!");
    	  
    	  System.out.println("enter value for x");	
  	      int x = sc.nextInt();	
  	      System.out.println("enter value for y");	
  	      int y = sc.nextInt();
  	      System.out.println("enter value for z");	
	     int  z = sc.nextInt();
	      
	      
    	  int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
    	  System.out.println("The largest numbers is:  "+largestNumber);  
    	  break;
    		  
      case 3:
    	  System.out.println("Your are in Binary Operator!!");
  
    		System.out.println("Arithmetic Operation");	
    	    System.out.println("1.Addition");		
    	    System.out.println("2.Subtraction");	
    	    System.out.println("3.Multiplication");
    	    System.out.println("4.Division");	
    	    
    	    System.out.println("enter choice:");		
    	    char bo = sc.next().charAt(0);
    	    System.out.println("enter value for x");	
    	    x = sc.nextInt();	
    	    System.out.println("enter value for y");	
    	    y = sc.nextInt();
    	    
    	    
    	    switch(bo)
    	    {
    	    case 1:
    	    	System.out.println("Adition");
    	    	z=x+y;
    	    	System.out.println("Addition is "+z);
    	    	break;
    	    	
    	    case 2:
    	    	z=x-y;
    	    	System.out.println("Subtraction is "+z);
    	    	break;
    	    	
    	    case 3:
    	    	z=x*y;
    	    	System.out.println("Multiplication is "+z);
    	    	break;
    	    	
    	    case 4:
    	    	z=x/y;
    	    	System.out.println("Division is "+z);
    	    	break;
    	    	
    	    }
    	    break;  
    }
  }
}