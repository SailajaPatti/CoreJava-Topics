package LearnJava;

import java.util.ArrayList;

public class Arrays {
	
	public static void main(String args[]) {
	
	// declaring array
	int[] Array ; 
	//allaocation of array
	Array =  new int[5];
	//initialising elements
	Array[0]=1;
	Array[1]=2;
	System.out.println("1st element:" + Array[0]);
	System.out.println("2nd element:" + Array[1]);
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("Sailu");
	a.add("Lishika");
	System.out.println(a.get(1));
	
	String S = "Sailu Patti Lishika";
	
	String[] Splitarray = S.split(" ");
	System.out.println(Splitarray[0]);
	System.out.println(Splitarray[1]);
	System.out.println(Splitarray[1].trim());
	
	for(int i=S.length()-1;i>=0;i--) {
		System.out.println(S.charAt(i));
		
		
	}
		
	
	
	
}
	
}

	
	
	
	
	



