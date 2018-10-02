package JavaBasics;

public class ConstructorConcept {

	public ConstructorConcept() {// no returntype no static just classname | looks like a method
		System.out.println("Default const");
	}

	public ConstructorConcept(int i) {// Constructor overloading
		System.out.println("single param constructor");
		System.out.println("the value of i:" + i);
	}

	public ConstructorConcept(int i, int j) {// once object is created immed. constructor is called
		System.out.println("double param constructor");
		System.out.println("the value of i:" + i);
		System.out.println("the value of j:" + j);

	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();// once object is created immed. default constructor is called
		ConstructorConcept obj2 = new ConstructorConcept(10);
		ConstructorConcept obj3 = new ConstructorConcept(10, 20);

	}

}
