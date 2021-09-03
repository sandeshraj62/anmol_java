package java_Array;
// Find the maximum and minimum number present in array? 
public class Find_max_and_min_numb_in_array {
	public static void main(String args[])
	{
		int[] a= {8,6,4,2,3,5,7,9,16};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}	
		}
		System.out.print("maximum number is :"+max);
		System.out.println("\n-----------------------------");
		for(int j=0;j<a.length;j++) 
		{
			if(min>a[j])
			{
				min=a[j];
			}
		}
		System.out.print("Minimum number is:"+min);
	}

}
