class A {
    void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    void print_B() {
        System.out.println("Class B");
    }
}

class C extends A {
    void print_C() {
        System.out.println("Class C");
    }
}

class D extends C {
    void print_D() {
        System.out.println("Class D");
    }
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.print_A();
        //obj.print_B();
	obj.print_C();
        obj.print_D();
    }
}
