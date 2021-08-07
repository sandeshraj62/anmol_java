package Java_operator;

public class logical_bitwise_operator {
	public static void main(String args[])
	{
		int a=1;
		int b=2;
		int c=3;
		System.out.println(a<b&&a++<c); //logical= true&&true=true
		System.out.println(a<b&a++<c); //bitwise= true&true=false
	}

}
