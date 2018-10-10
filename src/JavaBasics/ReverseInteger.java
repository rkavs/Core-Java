package JavaBasics;

public class ReverseInteger {

	public static void main(String[] args) {

		// 1.using algo

		long num = 12345; // 54321

		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(rev);

		// 2.using StringBuffer method

		long num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
