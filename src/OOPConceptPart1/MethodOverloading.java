package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);

	}

	public static void main(int p) {

	}
	public static void main(int q,int h) {

	}
	// you cannot create a method inside a method
	//duplicate methods -- i.e. same method with same number of arguments are not allowed

	//method overloading-->when the method name is same with different arguments or input parameters within the same class

	public void sum() {//0 input param
		System.out.println("SUM method --zero param");
	}
	public void sum(double d) {//1 input param
		System.out.println("SUM method --1 input param");
	}
	public void sum(int i) {//1 input param
		System.out.println("SUM method --1 input param");
		System.out.println(i);
	}
	public void sum(int k,int l) {//2 input params
		System.out.println("SUM method --2 input params");
		System.out.println(k+l);
	}

}
