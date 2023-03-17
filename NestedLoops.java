package JavaConcepts;

public class NestedLoops {
	public static void main(String args[])
	{
		for(int i=0;i<=4;i++) {
			System.out.println("outer loop started");
			for(int j=0;j<=2;j++) {
				System.out.println("inner loop");
			}
		}
		//Practice Exercise
		int m=1;
		for(int k=1;k<=4;k++) {
			
		
			for(int l=0;l<=4-k;l++) { //here these k and l are only for iterations of printing 'm'
				System.out.print(m); //first loop is execution of 2nd one and 2nd is for exe of m till that loop ends
				System.out.print("\t"); //to print space between 1 2 3 4
				m++;
			}
			System.out.println("");
		}
	
//output
/* 1 2 3 4
   5 6 7
   8 9
   10
*/
//u can just imagine that definately we need to use loop concepts and it is four times also need to take
//inner loop concept also to print each line in each cycle of outer loop


//2nd assignment
/*
1
2 3
4 5 6
7 8 9 10
*/
		int q=1;
       for(int n=0;n<4;n++) {
    	   for(int p=0;p<1+n;p++) {
    		   System.out.print(q);
    		   System.out.print("\t");
    		   q++;
    	   }
    	   System.out.println("");
       }
      
      //3rd Assessment
       /* 3
        * 6 9
        * 12 15 18
        */
       

}}