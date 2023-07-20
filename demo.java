import java.util.Scanner;
class demo {

	public static void main(String args[]){
	Scanner u = new Scanner(System.in);
	System.out.print("Enter your age : " );
		int age = u.nextInt();
		if (age>17)
		{
		System.out.println("your age is eligible");
		}
		else
		{
		System.out.println("your age is not eligible");
		}
		System.out.print("Enter your mark : " );
		int mark = u.nextInt();
		if(mark>60)
		{
			System.out.print("Do you have bike?" );
			int user = u.nextInt();
			if(user == 1)
			{
			System.out.println("you are eligible for applying !" );
			}
			else if(user == 2)
			{
			System.out.println("you are ok");
			}
			else 
			{
			System.out.println("enter 1 0r 2" );
			}
		}
		else
		{
		System.out.print("no way" );
		}
}

}