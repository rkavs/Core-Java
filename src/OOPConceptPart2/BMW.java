package OOPConceptPart2;

public class BMW extends Car{//"has-a relationship" OR class to class inheritance

	//when same method is present in parent class as well as child class with the same name and same number of arguments,
	//is called Method-Overriding, the child method gets prority during compile time

	public void start() {
		System.out.println("BMW---start");
	}

	public void threadSafety() {
		System.out.println("Car---start");
	}




}
