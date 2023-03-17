package JavaConcepts;

import java.util.Scanner;

public class Whiledemo {
	public static void main(String args[])
	{
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	
   int j=10 ;
   while(j>0) {
	System.out.println(j);
	j--;
}
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2==0) {
		System.out.println("even");
	}
		else {
			System.out.println("odd");
		}
	
	//ternary operator
String result=	(n%2==0 ? "even":"odd");
System.out.println(result);
	}}
/*do {
	int l=10;
	System.out.println(l);
	l++; */
