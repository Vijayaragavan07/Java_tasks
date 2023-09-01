class Constructor{

	

	int id; 
	
 	String name;

	Constructor(int i, String n){

	id = i;

	name = n;

	}

	Constructor(){}

	void display(){

	System.out.println(id+ " " + name);

	}


	public static void main(String args[]){

	Constructor c = new Constructor(101, "vijay");

	Constructor c1 = new Constructor();

	c1.id = c.id;

	c1.name = c.name;

	c.display();

	c1.display();


	}





}
