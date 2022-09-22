// WAP Accept chacter from user and check it is vowel or not

import java.util.Scanner;

class Vowel{
   public static void main(String args[]) {
 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a character :");
      char ch = sc.next().charAt(0);
      
      switch(ch) 
      {
         case 'A' :
         case 'E' :
         case 'I' :
         case 'O' :
         case 'U' :
         case 'a' :
         case 'e' :
         case 'i' :
         case 'o' :
         case 'u' :
        	 System.out.println(ch+" is a Vowel!!!");
        	 break;
        	 
        	default :
        		System.out.println(ch+" is Not Vowel!!!");
      }  
   }
}
