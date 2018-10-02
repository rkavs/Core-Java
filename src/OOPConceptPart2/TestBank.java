package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();

		//dynamic polymorphism:
		//child class object can be referred by parent class Interface reference var
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();

	}

}
