import java.util.Scanner;
class VowelOrConstant{

	public static void main(String args[]){

	Scanner s = new Scanner(System.in);

	char a = 'a' | 'A', e = 'e' | 'E',i = 'i' | 'I',o = 'o' | 'O',u = 'u' | 'U';

	System.out.print("Enter alphabet to check vowel or constant : ");
	
	char var = s.next().charAt(0);

		if((var == a) | (var == e) | (var == i) | (var == o) | (var == u)){

		System.out.println("The alphabet " + var + " is Vowel " );

		}
		else{

		System.out.println("The alphabet " + var + " is Consonant " );

		}
	}
}