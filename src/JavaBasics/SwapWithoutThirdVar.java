package JavaBasics;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {

		int x = 5;// 0101
		int y = 10;// 1010

		// 1.using third var :t
		/*
		 * int t=x; x=y; y=t;
		 */

		// 2. without using third var : using + operator

		/*
		 * x=x+y; y=x-y; x=x-y;
		 */

		// 3. without using third var : using * operator

		/*
		 * x=x*y; y=x/y; x=x/y;
		 */

		// 4.using XOR operator: ^

		x = x ^ y;// 15 -->1111
		y = x ^ y;// 10 -->1010
		x = x ^ y;// 5 --> 0101

		System.out.println(x);
		System.out.println(y);

	}

}
