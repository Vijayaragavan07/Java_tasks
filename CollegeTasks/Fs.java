class Fs{

	int id;

	String name;

	Fs(int i, String n){

		id = i;

		name = n;
	}

	void display(){

		System.out.println(id +" " + name);
	}

	public static void main(String args[]){

	Fs o = new Fs(111,"Vijay");

	Fs ob = new Fs(112,"Ragu");

	o.display();

	ob.display();

	}
}