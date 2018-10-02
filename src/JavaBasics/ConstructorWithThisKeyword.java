package JavaBasics;

public class ConstructorWithThisKeyword {

	// class vars
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name; // this.global var= local var | this keywrd used to initialize global/class vars
		// with the current value of obj
		this.age = age;// you can also use name1 and then this keyword won't be needed

	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);

		System.out.println(obj.age);
		System.out.println(obj.name);

	}

}
