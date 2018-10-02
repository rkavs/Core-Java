package JavaBasics;

public class FinalizeConcept {// when an obj doesnot have any ref var, garb collector gc is called to destro
	// the obj by JVM
	// finalize method is called just before gc to clear the process
	//finalize is a method
	//finally is a block
	//final is a keyword

	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();

		f1 = null;
		f2 = null;

		System.gc();

	}

}
