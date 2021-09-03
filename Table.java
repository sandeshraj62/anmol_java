package basics;
import java.util.Scanner;
 public class Table 
{
	public void main()
	{
		System.out.println("Enter the number which table you want to print:");
		Scanner anmol = new Scanner(System.in);
	    int anm = anmol.nextInt();
		 int result=0;
		   for(int i=1;i<=10;i++)
		   {
			   result=anm*i;
			   System.out.println(anm+" X "+i+"="+result);
		   }
	    anmol.close();
	}
   public static void main(String args[])
   {
	   Table anmol= new Table();
	   anmol.main();
   }
}
