import java.util.Scanner;
class email
{

	public static void main(String args[])
	{

	Scanner u = new Scanner(System.in);
	System.out.println("enter email");
	String var = u.nextLine();
	System.out.println(var.concat("@gmail.com").toLowerCase());
}
}	