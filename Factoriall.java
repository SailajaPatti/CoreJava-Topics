package AutomationWithJava;

public class Factoriall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1,i,number=5,count=0;
		for (i=1;i<=number;i++)
		{
			fact=fact*i;
			
		
		}
		System.out.println("factorial no " + fact);
		for(i=1;i<=fact;i++)
		{
			if(fact>0) {
			fact=fact/i;
			count++;
			}
			
		}
		System.out.println(count);
		
	}

}
