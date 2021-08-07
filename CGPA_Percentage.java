package basic;

public class CGPA_Percentage {
	public static void main(String args[])
	{
		double English = 9.1;
		double Math = 9.5;
		double Science = 9.6;
		double Hindi = 8.5;
		double Socialstudy = 8.6;
		double CGPA =((English+Math+Science+Hindi+Socialstudy)/(5.0));
		float CGPA_Percentage =(float)(9.5*(CGPA));
		System.out.print("CGPA Precentage="+CGPA_Percentage);
	}

}
