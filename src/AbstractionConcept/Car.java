package AbstractionConcept;

public interface Car {

	// Always define only abstract methods --
	// no method body
	// only method declaration
	// 100% abstraction
	// cannot create object of Interface
	// only static and final vars

	int wheels = 4; // by default it is static

	public void start();

	public void stop();

	public void refuel();

}
