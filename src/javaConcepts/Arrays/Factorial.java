package javaConcepts.Arrays;

public class Factorial {

	public static void main(String[] args) {
		int n=4;
		 System.out.println(factorial(n));

	}

	private static int factorial(int n) {
		if(n==0) return 1;
		return n*factorial(n-1);
	}
	

}
