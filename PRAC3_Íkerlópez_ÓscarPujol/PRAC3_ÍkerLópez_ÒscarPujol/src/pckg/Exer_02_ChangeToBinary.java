package pckg;

public class Exer_02_ChangeToBinary {

	
	public static void main (String [] args) {

		/* COMPLETE */
		//Perform some tests here
		System.out.println(toBinaryString(1));
		System.out.println(toBinaryString(3));
		System.out.println(toBinaryString(10));
		System.out.println(toBinaryString(15));
		System.out.println(toBinaryString(100));

	}
	
	
	public static String toBinaryString(int n) {
		/* COMPLETE */
		// Write the recursive function that creates the binary representation of n (n>=0)

		String r = "";
		if (n==0){return "0";}
		if (n==1){return "1";}
		r += toBinaryString(n/2);
		r += toBinaryString(n%2);
		return r; //Change this to return the corresponding String
		} 
	}
	
	
}
