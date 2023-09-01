public class JavaExceptionExample{

	public static void main(String args[]){

		try{

		int data = 100 / 0;

		}

		catch(Exception e){

		e.printStackTrace();

		}
	System.out.println("Rest of the code");

	}

}