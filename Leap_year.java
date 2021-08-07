package control_statement;

public class Leap_year {
	public static void main(String args[])
	{
		int year=2022;
		if((year%4==0)&(year%400==0)) {
			System.out.println(" LEAP YEAR:");
		}else if (year%100!=0) {
			System.out.println("COMMON YEAR:");
		//}else if (year%400==0) {
		//	System.out.println("LEAP YAER:");
		}
			
		}
}
