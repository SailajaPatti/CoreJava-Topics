package LearnJava;

public class SimpleJava {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println("a+b="  + c);
		int d = b-1;
		System.out.println("b-1=" + d);
		
		a++;
		System.out.println(a);
		
		d--;
		System.out.println(d);
		
		if((a<b) && (a<a+1)) {
			System.out.println(" a is less than b and a+c");
		}
			else {
				
	   System.out.println(" a is greater b and a+c");
			
		}
		
		
	}

}
