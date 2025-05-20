package pckg;


import java.util.Random;

public class Exer_01_GCF {
	
	public static void main (String [] args) {
		/* COMPLETE */
		/* Write here a program that generates 100000 pairs of numbers
		between [1, 5000] to check that the function calculates the GCF.*/
		Random r = new Random();
		for(int i = 0; i<100000; i++){
			int x = r.nextInt(1, 5001);
			int y = r.nextInt(1, 5001);

			System.out.println("MCD: "+ MCD( x, y) +" iterativeGCF: "+ iterativeGCF(x,y));
		}
	}
	
	
	/* COMPLETE */
	// write here a recursive function that calculates the GCF using Dijkstra's algorithm


	public static int MCD(int x, int y){
		if(x==y){
			return x;
		} else{
			int max = x;
			int min = y;
			if(y>x) {
				max = y;
				min = x;
			}
			int r = max-min;
			return MCD(r, min);
		}
	}


	/*DO NOT MODIFY CODE BELOW*/
	public static int iterativeGCF(int x, int y) {
		// iterative gcf. Do not modify this function
		int inter;
		int small = Math.min(x, y);
		int great = Math.max(x, y);
		int remainder = great%small;
		while (remainder!=0) {
			inter = small;
			small = Math.min(small, remainder);
			great = Math.max(inter, remainder);
			remainder = great%small;
		}
		return small;
	}
	

}
