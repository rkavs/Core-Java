package AbstractionConcept;

public abstract class Bank {

	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;

	// partial abstraction
	// hiding the implementation logic -- is called Abstraction(OOP concept)
	// abstract class faster than Interface
	// Abs class can have abs and non abs methods
	// cannot create object of Abstract class

	public abstract void loan(); // abstract method -- no body, min 1 abstarct mthd needed in abstrct class

	// non abstract methods

	public void credit() {
		System.out.println("Bank-- Credit");
	}

	public void debit() {
		System.out.println("Bank-- Debit");
	}

}
