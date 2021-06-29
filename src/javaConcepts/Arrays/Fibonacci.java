package javaConcepts.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		
		int x = 0;
		int y = 1;
		int c=0;
		
		System.out.print(x + " ");
		System.out.print(y + " ");
		
		for(int i=2;i<n;i++) {
			c=x+y;
			x=y;
			y=c;
			System.out.print(c + " ");
		}

	}

}
