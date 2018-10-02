package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {

		//1. while loop:
		//dis-advantage of while loop : it will generate infinite loop if you don't give incremental/decremental part

		int i =1; //initialization
		while(i<=10){//conditional
			System.out.println(i);
			i=i+1;//incremental/decremental
		}

		System.out.println("**************************");

		//2. for loop:

		for(int j=1;j<=10;j++){//initialization,conditional,incremental/decremental

			System.out.println(j);
		}




	}

}