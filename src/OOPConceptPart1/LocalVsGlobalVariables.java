package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//Global vars -- class variable
	String name = "Tom";
	int age = 25;


	public static void main(String[] args) {
		int i=10; //local var for main method
		System.out.println(i);

		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		//you need to create obj's to access global/class vars
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	public void sum() {
		int i=15; //local var for sum method
		int j =20;
	}

}
