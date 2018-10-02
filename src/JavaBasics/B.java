package JavaBasics;

public class B extends A {

	public B() {
		super(10, 20); // super calls parent class constructor; even if not used it will call parent
		// const
		// but if you use it will specifically only call the par const for which you are
		// passing args as above
		// super keyword should be written inside the child const and it should be the
		// first statement
		// it can only be written once, cant use 2 super keywords, in that case create
		// another const and pass the other par const with super
		System.out.println("child class const");
	}

	public B(int i) {
		super(i);

	}

	public B(int i, int j) {
		super(i, j);

	}

	public static void main(String args[]) {

		B obj = new B();// when child class obj created parent class constructor also called
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}

}
