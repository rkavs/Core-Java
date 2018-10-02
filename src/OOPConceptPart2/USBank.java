package OOPConceptPart2;

public interface USBank {

	int min_bal = 100;

	public void credit();

	public void debit();

	public void transferMoney();

	//only method declaration
	//no method body - only method prototype
	//in Interface, we can declare the variables, variables are by default static in nature
	//vars value will not be changed, its final/constant in nature
	//no static method in Interface-as Interface is a part of OOP concept,its part of objects, so objects cant access
	//static methods , hence the methods should be non static in Interface
	//no main method in Interface
	//we cannot create the object of Interface
	//Interface is abstract in nature



}
