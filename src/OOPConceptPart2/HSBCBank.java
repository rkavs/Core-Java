package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank{//we are achieving multiple inheritance only possible with interfaces not classes
	//Is-a relationship OR interface to class inheritance

	//If a class is implementing any interface, then its mandatory to define/override all the methods of Interface
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc--credit");
	}

	public void debit() {
		System.out.println("hsbc--debit");
	}

	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}

	//separate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}

	public void carLoan() {
		System.out.println("hsbc--Car loan");
	}

	//BrazilBank method: overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
	}

}
