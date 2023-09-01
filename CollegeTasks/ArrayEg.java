import java.util.Scanner;
class ArrayEg{

	public static void main(String args[]){

	Scanner s = new Scanner(System.in);

		int a [] [] = new int [3] [2];

		System.out.println("Two Dimensional Array Value: ");

		for(int i = 0; i < 3; i++){

			for(int j = 0; j < 2; j++){

				a[i][j] = s.nextInt();
			}
		}	
		for(int i = 0; i < 3; i++){

			for(int j = 0; j < 2; j++){

				b[i][j] = s.nextInt();
			}
		}	
		for(int i = 0; i < 3; i++){

			for(int j = 0; j < 2; j++){

				System.out.print(a[i][j]+b[i][j]);
			}
		}
	}

}