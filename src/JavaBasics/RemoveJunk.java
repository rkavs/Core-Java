package JavaBasics;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "$$latin string 01234567890";

		// Regular Expression: [^a-zA-Z0-9] | use the symbol "^" to exclude what
		// you don't want to be replaced

		s = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s);

	}

}