package javaConcepts.Arrays;

import java.util.Arrays;

//Determine minimum length to cover of the roof to cover k cars.
public class ParkingDesign_CarRoof {

	public static void main(String[] args) {
		int[] cars = {6,2,12,7};
		int k=3;
		int min = Integer.MAX_VALUE;
		
		Arrays.sort(cars);
		
		for(int i=0;i<cars.length-k;i++) {
			min = Math.min(min, cars[i+k-1]-cars[i]);
		}
		min = min+1;
		System.out.println(min);

	}

}
