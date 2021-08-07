package Java_operator;

public class unary_operator {
	public static void main(String[] args)
	{
		int y=10;
		System.out.println(y++); // (10)print- (11)backend save 
		System.out.println(++y); // (12)print- 
		System.out.println(y--); // (12)print- (11)backend save
		System.out.println(--y); // (10)print -
	}

}
