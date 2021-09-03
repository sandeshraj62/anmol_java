package basics;
import java.util.Scanner;
public class AddingTwoNo 
{
	public void add()
	{
		Scanner sum = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int no1 =sum.nextInt();
		System.out.println("Enter the Second number:");
		int no2= sum.nextInt();
		System.out.println("Sum of two number:"+(no1+no2));
		sum.close();
	}
	public static void main(String args[])
			{
		      AddingTwoNo anmol= new AddingTwoNo();
		     // int am=anmol.nextInt();
		      anmol.add();
			}
	

}
