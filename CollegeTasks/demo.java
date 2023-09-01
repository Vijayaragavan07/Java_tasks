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
			Scanner ut = new Scanner(System.in);
			System.out.print("Do you have bike?" );
			String user = ut.nextLine();
			      
			if(user.equalsIgnoreCase("yes"))
			{
			System.out.println("you are eligible for applying !" );
			}
			else if(user.equalsIgnoreCase("chance"))
			{
			System.out.println("you are possible for applying" );

			}
			else if(user.equalsIgnoreCase("no"))
			{
			System.out.println("you are not eligible for applying" );

			}
			
		}
		else
		{
		System.out.print("no way" );
		}
}

}