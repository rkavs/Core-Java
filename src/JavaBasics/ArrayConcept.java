package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//to store similar data type in an array variable
		//lowest bound/index= 0
		//upper bound/index=n-1 (n is size of array)
		// one dimensional array

		//dis-advantages of array:
		//1. size is fixed -- static array -- to overcome this problem-- we use Collections- ArrayList,HashTable--use dyanmic array
		//2. stores only similar data types -- To overcome this problem, we use Object array.

		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;

		System.out.println(i[2]);
		System.out.println(i[3]);

		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException

		System.out.println(i.length); // size/length of array

		// print all the values of array : use for loop

		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);

		}

		// 2. double array :

		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;

		System.out.println(d[2]);

		//3. char array:

		char c[]=new char[3];
		c[0]='q';
		c[1]='2';
		c[2]='$';

		//4. boolean array:
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=false;

		//5. string array:

		String s[] =new String[3];
		s[0]="test";
		s[1]="Hello";
		s[2]="World";

		System.out.println(s.length);
		System.out.println(s[1]);

		//6. Object Array: (Object is a class) -- is used to store different data types values
		Object ob[]=new Object[6];
		ob[0]= "Tom";
		ob[1]=  25;
		ob[2]= 12.33;
		ob[3]= "1/1/1990";
		ob[4]= 'M';
		ob[5]= "London";

		System.out.println(ob[5]);
		System.out.println(ob.length);


	}

}
