package JavaBasics;

public class StringConcatenation {


	public static void main(String[] args) {

		// + : is concatenation operator
		// println is used to print on the console with a new line
		//print - is just used to print on the console

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";

		double c= 12.33;
		double d=10.33;


		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);

		// step by step left to right execution
		// when you add an int with a string with string first, for eg.-x+y+a becomes a new string

		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));

		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);

		System.out.println(c+d);
		System.out.println(x+y+c+d);

		System.out.println("HelloWorld");

		System.out.println(a);
		System.out.println("the value of a is :"+a);
		System.out.println("the value of b is :"+b);
		System.out.println("the addition of a and b is :"+(a+b));


		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");

	}

}