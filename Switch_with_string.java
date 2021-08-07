package control_statement;

public class Switch_with_string {
	public static void main(String ars[])
	{
		String levelString="Beginneer";
		int level=2;
		switch(levelString) {
		case "Beginneer":level= 1;
		break;
		case "Intermediate":level=2;
		break;
		case "Advanced":level=3;
		break;
		default:level=0;
	    break;
		}
			System.out.println("your level is:"+level);
		
		}
	}


