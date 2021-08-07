package polymorphism;

public class Adder1 {
	static int add(int a,int b){return(a+b);}
	static double add(double a,double b){return(a+b);}
}
 class AdderTest2{
	 public static void main(String args[]) {
		 System.out.println(Adder1.add(11, 12));
		 System.out.println(Adder1.add(10.2, 12.2));
	 }
 

}
