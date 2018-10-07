package JavaBasics;

public class ReverseString {

	public static void main(String[] args) {

		// 1.using for loop
		// dif bw String and StringBuffer? String is immutable StringBuffer is mutable
		// do we have reverse function in Str

		String str = "Selenium";
		String reverse = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}

		System.out.println(reverse);

		// 2. using StringBuffer class:

		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());

	}

}