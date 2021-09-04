package basics;
import java.util.Scanner;
class SecondProgram 
{ 
	public void Phone_Number()
	{
		
		System.out.println("Enter your Phone number:");
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String an =input.nextLine();
		System.out.println("Enter any number:");
		int a=input.nextInt();
		System.out.println("Enter any decimal or floating point number:");
		double d=input.nextDouble();
		System.out.println("Your name is:"+an);
		System.out.println("Int number:"+a);
		System.out.println("Double number :"+d);
	    input.close();
		
		
		
	}
	

}
