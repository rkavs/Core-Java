package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);

		//data conversion: String to int:
		int i = Integer.parseInt(x);
		System.out.println(i+20);

		//Wrapper classes- Integer,Double,Character,Boolean

		//String to double conversion:
		String y = "12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);

		//String to boolean:
		String k ="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);

		//int to String conversion:
		int j = 200;
		System.out.println(j+20);

		String s = String.valueOf(j); //"200"
		System.out.println(s+20);

		String u = "100A";
		Integer.parseInt(u); //NumberFormatException -- For input string: "100A"

	}

}
