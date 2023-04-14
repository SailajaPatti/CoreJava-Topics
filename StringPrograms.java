package AutomationWithJava;

import java.util.Arrays;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//checking of two string are Anagram or not which means two strings contain same characters with different order
		String S1="mary";
		String S2="army";
		char[] ch1=S1.toLowerCase().toCharArray();
		char[] ch2=S2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//verifying Anagram or not after sorting
		System.out.println(Arrays.equals(ch1, ch2));
		//binary search which means finding the index of that charactor
		System.out.println(Arrays.binarySearch(ch1, 'm'));
		//it return 0 when both r equal, it returns >0 when 1 contains more charactors than 2 , it returns <0 when 1 contains less than 2
	    System.out.println(Arrays.compare(ch1, ch2));
	    //to convert String into Integer
	    String I="1234";
	    int result=Integer.parseInt(I);
	    System.out.println(result);
		//Finding no of words in a string
	    String sen="Hello Welcome to the World";
	   String[] splits= sen.split(" ");
	   System.out.println(splits.length);
	 
		
	}

}
