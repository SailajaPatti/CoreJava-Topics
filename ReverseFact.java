package AutomationWithJava;

import java.util.Scanner;

public class ReverseFact {
	public static void main(String[] args) {
		
		      Scanner sc = new Scanner(System.in); 
		      System.out.println("Please enter a number to compute reverse factorial: "); 
		      int number = sc.nextInt(); 
		      int reverse = number; 
		      for(int a = 2; reverse != a; a++) 
		      { 
		         reverse = reverse / a; 
		      } 
		      System.out.println("Reverse factorial of " + number + " is: " + reverse); 
		      sc.close(); 
		   } 
		} 
	
