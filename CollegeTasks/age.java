import java.util.Scanner;
class age{

	public static void main(String args[]){

		Scanner u = new Scanner(System.in);
		System.out.println("");
		System.out.println("-----Age eligibility-----");
		System.out.println("");
		System.out.print("Enter your age : " );
		int age = u.nextInt();
		System.out.println("");
		if(age>=18)
		{
		System.out.println("You are eligible to voting");
		}
		else
		{
		System.out.println("You are not eligible to voting");
		}

		System.out.println("");
		System.out.println("-----Grade Checking-----");
		System.out.println("");
		System.out.print("Enter your mark : " );
		int mark = u.nextInt();
		System.out.println("");
			if((mark >= 0) && (mark <= 39))
			{
			System.out.println("Your grade is : 'D' ");
			}

			else if((mark >= 40) && (mark <=59))
			{
			System.out.println("Your grade is : 'C' ");
			}

			else if((mark >= 60) && (mark <=79))
			{
			System.out.println("Your grade is : 'B' ");
			}

			else if((mark >= 80 && mark <=89))
			{
			System.out.println("Your grade is : 'A' ");
			}

			else if((mark >= 90 && mark <=100))
			{
			System.out.println("Your grade is : 'O' ");
			}

}
}