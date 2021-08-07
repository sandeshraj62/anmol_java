package polymorphism;

public class Adder {
	static int add(int a,int b){return(a+b);}
	static int add(int a,int b,int c){return (a+b+c);}   
}
 class TestAdder1{
	 public static void main(String args[]) {
		 //Adder obj = new Adder();
		 System.out.println(Adder.add( 11,11));
		 System.out.println(Adder.add(11,11,11));
	 }
	// 
	 
}
