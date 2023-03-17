package AutomationWithJava;

import java.util.HashMap;

public class CountOfEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		        HashMap<Character, Integer> result = new HashMap<>();
		        String s = "aabcab";
		       for (int i = 0; i < s.length(); i++) {
		          char mychar = s.charAt(i);
		          if(result.containsKey(mychar))
		          {
		              int count = result.get(mychar);
		              result.put(mychar, ++count);
		              System.out.println(count);
		          }else {
		              result.put(mychar,1);
		          }
		        }
		        System.out.println(result);   
		    }
		
	

}
