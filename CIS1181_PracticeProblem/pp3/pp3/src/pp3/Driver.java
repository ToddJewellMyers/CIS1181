// Todd J Myers
// 5/26/2020
// practice problem 3
// Exceptional Division 

package pp3;

import java.util.Scanner;


public class Driver 
{
	public static void main(String[] args) 
	{
		// scanner
		 Scanner sc = new Scanner(System.in);
	
	       String number;
	       int numerator,denominator;
	       
	       // while loop for numerator using try and catch block 
	       while(true) 
	       {
	    	   // ask user for input numerator 
	           System.out.print("What is the numerator? ");
	           number = sc.nextLine();
	           try {
	        	   numerator = Integer.parseInt(number);
	               break;
	             //exception used for invalid data 
	           }catch(Exception e) {
	               System.out.println("Error : you must enter a whole number");
	           }
	       }

	       //while loop for denominator using try and catch block 
	       while(true) 
	       {
	    	   // ask user for input denominator 
	           System.out.print("What is the denominator? ");
	           number = sc.nextLine();
	           try
	           {
	               denominator = Integer.parseInt(number);
	               if(denominator==0) 
	               {
	                   System.out.println("Error: the denominator can't be zero");
	                   continue;
	               }
	               break;
	               //exception used for invalid data 
	           }catch(Exception e) {
	               System.out.println("Error : you must enter a whole number");
	           }
	       }
	      // prints out the outcome inputed by the user 
	       System.out.println(numerator+"/"+denominator+"="+(numerator/denominator));
	       //close scanner
	       sc.close();
	   }
	}
