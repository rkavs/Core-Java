package JavaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {

		// throw -used to create your own exception

		System.out.println("ABC");

		try {
			throw new Exception("Naveen Exception");
		} catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("PQR");

		String Exec_Flag = " ";
		if (Exec_Flag.equals(" ")) {
			try {
				throw new Exception("Exec Flag is blank Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("test");

	}

}
