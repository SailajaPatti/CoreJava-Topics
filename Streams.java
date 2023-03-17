package AutomationWithJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	
	public static void main(String[] args)
	{
		ArrayList <String> names=new ArrayList<String> ();
		
		names.add("sai");
		names.add("Anu");
		names.add("ben");
		names.add("Amruta");
		System.out.println(names);
		//1.now get names which are starting with A so first will do by normal procedure then will do by streams concept
		int Count=0;
		for(int i=0;i<names.size();i++)
		{
		String Actual=names.get(i);
		//	System.out.println(Actual);
		if(Actual.startsWith("A"))
			{
				Count++;
			}
		}
			
		
		System.out.println(Count);
		long a=names.stream().filter(s->s.startsWith("A")).count();
		
		//long is return type,.stream() is used to convert names object into stream then filter is the mediatery method and then
		//expression > means lambda expression to give conditon and then count is the ternary method which is mandatory to get o/p
		System.out.println(a);
		
		//2.get count which starts with A
		long b = Stream.of("Abi","bha","Anu").filter(s->s.startsWith("A")).count();
		{
			System.out.println(b);
		}
		
		//3.want to print which ends with a a and then convert into uppercase and print in the console
		Stream.of("rama","kina","sai").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//4.want to print which ends with a into uppercase but only any one for samle
		Stream.of("rama","kina","sai").filter(s->s.endsWith("a")).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//5.print names which ends with a and sorted manner
	  List<String> Name= Arrays.asList("ramk","kina","sailaja","lavanaya"); //coverting array into the Arraylist
	  Name.stream().filter(s->s.endsWith("a")).sorted().forEach(s->System.out.println(s));
	  
	  //6.HOW TO MERGE TWO STREAMS
	  Stream<String> newStream=Stream.concat(names.stream(), Name.stream());
	  newStream.forEach(s->System.out.println(s));
	  
	  //7.verify if the required element present in the list or not, firstly take a stream
	  
	boolean Flag=  Name.stream().anyMatch(s->s.equalsIgnoreCase("sailaja"));
	System.out.println(Flag);
	//Assert.assertTrue(Flag);----it can't work bcz TestNG dependency wasn't added into this pkg
	
	//8.get the 1st index values after sorted and upper case---use collect method for this to convert into list or set again to do operations
	
	List<String> ls=Name.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	  System.out.println(ls.get(0));
	  
	//
	 System.out.println(Stream.of('1','2','1','5','8').distinct().collect(Collectors.toList()));
	 
	 String Str="gguiydsd"; int count=0;
	 for(int i=0;i<Str.length();i++) {
		 if( Str.contains("g")) {
			 count++;
		 }}
	     
	      System.out.println(count);
	 
	 

	}}
		
		
		