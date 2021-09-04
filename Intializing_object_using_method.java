package basics;

class Intializing_object_using_method {
	String color;// instance variable
	int age; // instance variable
	public void input(String i, int a)  // Method number 1
	{
		color=i;
		age=a;
	}
	public void display() // Method number 2 
	{
		System.out.println(color+"_"+age);
	}
	public static void main(String args[])  // main method
	{
		Intializing_object_using_method buzo= new Intializing_object_using_method();
		buzo.input("black",12);
		buzo.display();
		
	}

}
