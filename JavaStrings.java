package AutomationWithJava;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an object that represents the sequence of characters
		String A="STRINGCLASS";
		String S="StringClass FGVC FCGCV";
		String B="SFFGF767788";
		
		System.out.println(S.join(",", S,A));
	System.out.println(S.join(">", B,A));
String[] C=S.split(" ", 2);
System.out.println(C[0]);
System.out.println(C[1]);
System.out.println(S.indexOf("GV"));
System.out.println(S.indexOf("t", 2));
		
		
		int number=76676;
		System.out.println(S.charAt(0));
		System.out.println(S.length());
		//string format--?
		
		//Substring
		
		System.out.println(S.substring(3));
		System.out.println(S.substring(3, 6));
		//concat
		System.out.println(S.concat(A));
		//contains
		boolean check=S.contains("ing");
		System.out.println(check);
		//comparison--
		int check1=	S.compareToIgnoreCase(A);
		System.out.println(check1);
		//endsWith
		System.out.println(S.endsWith("ass"));
		//equals
		System.out.println(S.equals(A));
	    //EqualsIgnorecase--?
		System.out.println(	S.equalsIgnoreCase(A));
		//index of char
		System.out.println(S.indexOf("t"));
		//changing character in string
		System.out.println(S.replace('t', 's'));
		//changing case
		System.out.println(S.toLowerCase());
		//into to char array--?
		char[] ch=S.toCharArray();
		for(int i=0;i<S.length();i++) {
			
		}
	    	if(S.contains("a")||S.contains("e")||S.contains("i")||S.contains("o")||S.contains("u")) {
	    		
	    		System.out.println("vowels are presented");
	    	}
		
	
		
		//to get only integers from the string
		System.out.println(B.replaceAll("[^0-9]", ""));
		//
		String S1="sailajabindu";
		char[] ch1=S1.toCharArray();
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
	System.out.println(Stream.of(ch).filter(s->s.equals(c)).count());
		
	}}



