package JavaConcepts;

public class AssignmentsOnLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //3rd assignment
	        /* 
	       1
	       1 2
	       1 2 3
	       1 2 3 4 */
	       
		for(int i=0;i<4;i++) {
			for(int j=1;j<=1+i;j++) {
				System.out.print(j);
			    System.out.print("\t");
		}
		System.out.println("");
	}
		//4th assignment
		/*
		 3
		 6 9
		 12 15 18
		 */
		int m=3;
     for(int k=1;k<=3;k++) {
    	 for(int l=1;l<=k;l++) {
    		 System.out.print(l*m);
    		 System.out.print("\t");
    		 
    	 }
    	 System.out.println("");
     }
}}
