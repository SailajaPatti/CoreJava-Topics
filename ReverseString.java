package AutomationWithJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Iam Learning";
		String Req="";
		//String[] B=s.split(" ");
		//System.out.println(B[0]);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			Req=ch+Req;
			
		}
	System.out.println(Req);
	//Stringbuilder concept
	String output="";
	String[] B=s.split(" ");
	for(String rw : B)
	{
		StringBuilder builder=new StringBuilder(rw);
		builder.reverse();
		output=output+builder.toString()+" ";
		}
	output.trim();
     System.out.println(output);
}}
