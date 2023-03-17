package AutomationWithJava;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueLIST {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		HashSet<Integer> newList=new HashSet<Integer>(list);
		System.out.println(newList);
		UniqueLIST.method("SAI");
	}
	
	public static String method(String s){
		System.out.println(s);

		return s;


}}
