class TestOverloading4{

	public static void main(String args[]){

	System.out.println("Main with String[]");

	main("Vijay");

	main();


	}

	public static void main(String args){

	System.out.println("Main with String1");

	}

	public static void main(){

	System.out.println("Main without args");

	}

}