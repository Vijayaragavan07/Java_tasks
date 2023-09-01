//Multiple inheritance not supported in java. Because, same method name is also available in different parent. so it is not possible..

class Animal{

	void eat(){

	System.out.println("Eating...");

	}
}

class Dog{

	void bark(){

	System.out.println("Barking...");

	}
}

class Cat extends Animal, Dog {

	void sleep(){

	System.out.println("Sleeping...");

	}
}

class MultipleInheritance{

	public static void main(String args[]){

	Dog d = new Dog();

	d.bark();

	d.eat();

	d.sleep();

	}
}