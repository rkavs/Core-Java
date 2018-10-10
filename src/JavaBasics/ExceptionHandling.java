package JavaBasics;

public class ExceptionHandling {

	/*
	 * int a =10; static ExceptionHandling obj;
	 */

	public static void main(String[] args) {

		// uncaught exception
		/*
		 * int i = 9/0; System.out.println(i);
		 */

		// caught exception -- where eclipse/compiler gives a hint before executing the
		// program
		// Thread.sleep(2000);

		// try-catch block:
		try {
			int i = 9 / 0;// this code will throw an exception
		} catch (ArithmeticException e) {

			e.printStackTrace();// prints the exception
			System.out.println(e.getMessage());

		}

		System.out.println("ABC");

	}

}
