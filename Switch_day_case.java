package control_statement;

public class Switch_day_case {
	public static void main(String[] args) {
		int day=2;
		String dayString="";
		switch(day)
		{
		case 1:dayString="1-Monday";
		break;
		case 2:dayString="2-Tuesday";
		break;
		case 3:dayString="3-Wednesday";
		break;
		case 4:dayString="4-Thrusday";
		break;
		case 5:dayString="5-Friday";
		break;
		case 6:dayString="6-Saturday";
		break;
		case 7:dayString="7-Sunday";
		break;
		default:System.out.println("Invalid Day:");
		}
		System.out.println(dayString);
	}
		
	}


