package java_Array;
import java.util.ArrayList;
    public class EvenOdd_through_Array 
    {
     public static void main(String args[])
     {
    	 ArrayList<Integer> ar1= new ArrayList<>();
	     ArrayList<Integer> ar2= new ArrayList<>();
	      int[] a= {9,8,7,6,5,4,3,2,1};
	          for(int i=0;i<a.length;i++)
	            {
		           if(a[i]%2==0)
		           {
			         ar1.add(a[i]);
		            }
		           else 
		           {
			        ar2.add(a[i]);
		            }
	              }
	              int total=0;
	             System.out.println("Even number are:");
	             for(int no:ar1)
	             { 
	            	 total=total+no;
		          System.out.print(no+" ");
	             }
	             System.out.println("\nNumber of even number are:"+ar1.size());
	             System.out.println("Sum of even number are :"+total);
	             
	             System.out.println("---------------------------------------------");
	             
	             int total1=0;
	             System.out.println("Odd number are:");
	             for(int no:ar2)
	             {
	            	 total1=total1+no;
	            	 System.out.print(no+" ");
	             }
	             System.out.println("\nNumber of odd number are:"+ar2.size());
	             System.out.println("Sum of odd num are:"+total1);
	             
	
     }
}
