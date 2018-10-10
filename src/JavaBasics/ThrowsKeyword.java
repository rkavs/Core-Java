package JavaBasics;

public class ThrowsKeyword {

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");

	}

	public void sum() {
		try {
			div();
		} catch (Throwable e) {// The Throwable class is the superclass of all errors and exceptions
			// you can write Exception instead of Ar. Exception or any other excp as that is
			// the superclass of all types of exceptions
			//the superclass of Throwable is object class, you can also write object here

		}

	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;// exception line, div throws exception sum catches and throws to main which
		// again throws exception and is finally caught by JVM so you need to write 1
		// try catch block
	}

}
