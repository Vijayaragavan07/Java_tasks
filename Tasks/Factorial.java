import java.util.*;

class Factorial{

	public static void main(String args[]){

	Scanner o = new Scanner(System.in);

	System.out.print("\nEnter a number to compute a factorial value : ");

	int n = o.nextInt();

	int fact = 0;

	for(int i = 0; i< n; i++){
		fact = n * (n-1)-(n-1);
	}

	

	System.out.println("\nThe factorial of " + n + " is : " + fact(n));


	
	}
}

