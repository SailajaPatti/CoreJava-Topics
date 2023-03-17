package AutomationWithJava;

public class BasicPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=549,reverse=0;int temp=number;
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		if(temp==reverse)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
