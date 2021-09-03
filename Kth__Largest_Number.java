package java_Array;

public class Kth__Largest_Number {
	public static void main(String args[])
	{
		int[] a= {8,4,6,2,3,7,9,1,5};
		int temp;
		int kth=6;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==kth-1)
			{
				System.out.print(kth +" largest number is:"+a[i]);
			}
		}
		System.out.println("\n-------------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
