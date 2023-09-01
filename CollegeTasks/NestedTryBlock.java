public class NestedTryBlock{

	public static void main(String args[]){

		try{
		
			try{

			System.out.println("Going to divide by 0");

			int b = 30 / 0;

			}

			catch(ArithmeticException e){

			e.printStackTrace();

			}

			try{

			int a[] = new int[5];

			a[5] = 4;

			}

			catch(ArrayIndexOutOfBoundsException e){

			e.printStackTrace();

			}

		System.out.println("Other Statement");

		}

		catch(Exception e){

		System.out.println("Handled the exception (Outer catch)");

		}
		
		System.out.println("Normal flow...");

	}
}