package Java_operator;

public class Eg1 {

	public static void main(String[] args) {
		int a=5, b=2;
		System.out.println(a++ + ++a); // 5+7=12
		System.out.println(++a + b);   // 8+2=10
		System.out.println(a+=4);      // 8+4=12
		System.out.println(a-=b);	// 12-2=10
		System.out.println(a);     // 10
	}
}
