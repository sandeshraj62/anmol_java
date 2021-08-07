package control_statement;
//// GRADING SYSTEM FOR STUDENT fail,D grade,C grade,B grade,A grade, A++ grade
public class STUDENT_GRADING_SYSTEM {
	public static void main(String args[])
	{
		int marks=11;
		if(marks<50) {
			System.out.println(" YOU ARE FAIL ");
		}else if(marks>=50 && marks<60) {
			System.out.println(" YOU HAVE SCORED D GRADE");
		}else if(marks>=60 && marks<70) {
			System.out.println(" YOU HAVE SCORED C GRADE");
		}else if(marks>=70 && marks<80) {
			System.out.println(" YOU HAVE SCORED B GRADE");
		}else if(marks>=80 && marks<90) {
			System.out.println("YOU HAVE SCORED A GRADE");
		}else if(marks>=90 && marks<100) {
			System.out.println("YOU HAVE SCORED A++ GRADE");
		}else {
			System.out.println(" INVALID");
			
		}
	}

}
