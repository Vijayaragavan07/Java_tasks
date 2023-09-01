import java.util.Scanner;
class EvenOdd{

	public static void findEvenOdd(int num){

	if(num % 2 == 0){

	System.out.println(num +" is a Even number");
	}

	else{

	System.out.println(num +" is a Odd number");
	}
	}

	public static void main(String args[]){

	Scanner s = new Scanner(System.in);

	System.out.print("Enter number : ");

	int num = s.nextInt();

	findEvenOdd(num);

	}
}