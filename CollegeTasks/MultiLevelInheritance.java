//Multi-level inheritance
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

class Cat extends Dog{

	void sleep(){

	System.out.println("Sleeping...");

	}
}

class MultiLevelInheritance{

	public static void main(String args[]){

	Cat d = new Cat();

	d.bark();

	d.eat();

	d.sleep();

	}
}