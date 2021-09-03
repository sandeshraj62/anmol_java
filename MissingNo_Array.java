package java_Array;
// this is more accurate than previous method 
// this method is XOR method used in finding a missing element in an array
public class MissingNo_Array
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,6};
		int xor1=a[0];    //1
		for(int i=1;i<a.length;i++)
		{
			xor1=xor1^a[i];
		}
		int xor2=1;
		for(int i=2;i<=(a.length+1);i++)
		{
			xor2=xor2^i;
		}
		System.out.println("Missing element is:"+(xor1^xor2));
	}
	

}
