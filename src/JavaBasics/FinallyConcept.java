package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {

		test1();
		test2();
		division();

	}

	public static void test1() {
		try {
			System.out.println("inside test1 block");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		}

		finally {// it will execute this block even if there is exception
			System.out.println("inside finally block");
		}

	}

	public static void test2() {
		try {
			System.out.println("inside test2 ");

		}

		finally {
			System.out.println("finally code in test2 method");
		}

	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;

		} catch (ArithmeticException e) {// if you write NullPointerException instead, you will get an exception
			// and then finally block will be executed, famous intvw question
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}

		finally {
			System.out.println("execute this code even after any exception");
		}

	}

}
