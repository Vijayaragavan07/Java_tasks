import java.util.Scanner;
class ScannerExample{

	public static void main(String args[]){

		System.out.println("Enter your first name : ");
		Scanner o = new Scanner(System.in);

		String firstname = o.nextLine();
		System.out.println("Enter your last name : ");
		char lastname = o.next().charAt(0);
		System.out.println("Your name is : " + firstname);
		System.out.println("Your initial is : " + lastname);

		
}	


}