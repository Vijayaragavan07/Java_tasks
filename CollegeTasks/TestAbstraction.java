abstract class Bike{

	Bike(){

	System.out.println("Bike is created");

	}

	abstract void run();

	void changeGear(){

	System.out.println("Gear changed");

	}
}

class Honda extends Bike{

	void run(){

	System.out.println("Running safely...");
	}
}

class Suzuki extends Honda{

	void run(){

	System.out.println("Running safelyhgoygogoiuiou...");
	}
}


class TestAbstraction{

	public static void main(String args[]){

	Bike o = new Suzuki();

	o.run();

	o.changeGear();

	}
}