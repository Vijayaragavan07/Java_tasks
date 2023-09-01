class TestFinallyBlock{

	public static void main(String args[]){

		try{

		//below code do not throw any exception

		int data = 25 / 5;
	
		System.out.println(data);

		}

		//Catch won't be executed

		catch(NullPointerException e){

		e.printStackTrace();

		}

		//Executed regardless of exception occured or not

		finally{

		System.out.println("Finally block is always executed");

		}
	System.out.println("Rest of phe code...");

	}

}