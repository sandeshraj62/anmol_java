package polymorphism;

public class OverloadingCalculation {
	void sum(double a,double b){System.out.println(a+b);}
	void sum(int a,int b,int c){System.out.println(a+b+c);}
	public static void main(String args[]) {
		OverloadingCalculation obj = new OverloadingCalculation();
		obj.sum(20.4,10.2);
		obj.sum(22,22,22);
	}

}
