import java.util.Scanner;
class College
	{
	public static void main(String args[]){
		Scanner a = new Scanner(System.in);
		System.out.println("");
		/*System.out.print("Enter your age : ");
		int age = a.nextInt();
		if(age >= 17)
		{
		System.out.println("You are eligible to join college !);
			System.out.println("");
			System.out.print("Enter your 12th percentage : ");
			int percent = a.nextInt();
			if(percent >=60)
			{
			System.out.println("You percentage is good");
			}
			else
			{
			System.out.println("You percentage is not enough");
			}
		}
		else
		{
		System.out.println("You are not eligible to join college");
		}*/
		
		System.out.println("Enter value from 1 to 7 : ");
		int num = a.nextInt();
		switch(num)
		{
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		case 7:
		System.out.println("Sunday");
		break;
		
		default:
		
		System.out.println("Please enter valid number (1 to 7) ");
		}
		
	}
}

	
      		
	
		