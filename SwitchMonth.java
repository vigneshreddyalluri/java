public class SwitchMonth {
	public static void main(String args[])
	{	
		String month = args[0];
		int month1 = Integer.valueOf(args[0]);
		System.out.print("Month:"+month+" is ");
		switch(month)
		{
		case "1":
			System.out.println("Jan");
			break;
		case "2":
			System.out.println("Feb");
			break;
		default: System.out.println("Please enter months b/w 1 to 12 only");
		}
		switch(month1)
		{
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
			
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;	
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;	
		default: System.out.println("Please enter months b/w 1 to 12 only");	
		}	
		
	//	/*Doubt=============
		/*{
			//if(month == "6") {
		
			System.out.println("Jun"+month);
			}
			if(month1 == 7) {
			System.out.println("Jul"+month1);
			}
			else if(month1 == 8) {
			System.out.println("Aug"+month1);
			}
			else if(month == "9") {
			System.out.println("Sep"+month);
			}
			else {
			System.out.println("Please enter months b/w 1 to 12 only");
			
			}*/
		}
		
	}

