package AutomationWithJava;

public class Stringsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="Hello";
		String b="Hello";
		String s=new String("welcome");
		String s1=new String("welcome");
		System.out.println(a.equals(b)); //return true since equals operator check content of the Strings
		System.out.println(a==b); //returns true only since == check whether these 2 variables r referencing same object or not
		System.out.println(s.equals(s1));//returns true having same value
		System.out.println(s==s1); //return false both are not referencing same object since they both seperately created it's memory
		
		System.out.println(a.concat("world")); //here it will concat and print
		System.out.println(a); //but here a only print latest value of a won't print since strings are immutable
		String c=a.concat("world");//in this case it will print since u r taking into c and printing rt
		System.out.println(c);
		
		//so to achieve this StringBuffer and StringBuilder classes has been introduced
		StringBuffer buffer=new StringBuffer("Hello");
		buffer.append("world");
		System.out.println(buffer); //so appended buffer will print
		buffer.insert(2, "sailu"); //to insert sailu in 2nd index
		System.out.println(buffer);
		buffer.replace(2, 7, "l");
		System.out.println(buffer);
		buffer.deleteCharAt(4);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		 
		
	}

}
