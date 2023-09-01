//Hierarchy inheritance
class Animal{

	void eat(){

	System.out.println("Eating...");

	}
}

class Dog extends Animal{

	void bark(){

	System.out.println("Barking...");

	}
}

class Cat extends Animal{

	void sleep(){

	System.out.println("Sleeping...");

	}
}

class Goat extends Cat{

	void Crop(){

	System.out.println("Grass...");

	}
}

class HierarchyInheritance{

	public static void main(String args[]){

	Goat d = new Goat();

	d.eat();
	
	//d.bark();

	d.sleep();

	d.Crop();

	}
}