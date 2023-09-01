class Sample{ 

	static int count = 0;//Memory is constant but value will gets reinitialize
	int c = 100;

	Sample(){
	count++;
	System.out.println(count);
	}

	void sum(){
	int a = 5, b = 10;
	System.out.println("Sum value is : " + (a+b));
	}

	static void display(){ //static method without creating an object the method will run
	System.out.println("Hai Hello" +count);
	}

	static { //static block
	
	System.out.println("Static value ");
	count = count + 2;
	System.out.println(count);
	}
	

	public static void main(String vij[]){

	Sample o = new Sample();
	o.sum();
	display();
	Sample o1 = new Sample();
	Sample o2 = new Sample(); 
	System.out.println(vij[0] + vij[2]);
	}

	
}