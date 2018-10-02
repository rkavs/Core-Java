package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		//++
		//--

		int i=1;
		int j=i++;  //post increment meaning first value of i is assigned to j, becomes 1 and then increment i to 2

		System.out.println(i);
		System.out.println(j);

		int a=1;   // pre increment
		int b=++a;

		System.out.println(a);
		System.out.println(b);


		int m=2;
		int n=m--; //post decrement

		System.out.println(m);
		System.out.println(n);

		int p=2;
		int q=--p; // pre decrement

		System.out.println(p);
		System.out.println(q);




	}

}