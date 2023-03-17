package AutomationWithJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {'8','9','4','2','2','1','4','7','7'};
      List A= Arrays.asList(a);
    //  A.stream().filter
   List<Integer> S=   (List<Integer>) A.stream().distinct().collect(Collectors.toList());
   System.out.println(S);
   
	}
}