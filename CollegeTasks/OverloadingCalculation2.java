class OverloadingCalculation2{

	void sum(int a, int b){

	System.out.println("int arg method invoked");
	}

	void sum(long a, long b){

	System.out.println("long arg method invoked");
	}
	

	public static void main(String args[]){

	OverloadingCalculation2 o = new OverloadingCalculation2();

	o.sum(20,20);


	}
}