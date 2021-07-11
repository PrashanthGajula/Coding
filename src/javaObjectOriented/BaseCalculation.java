package javaObjectOriented;

public class BaseCalculation {
	int result;
	
	public void add(int x, int y) {
		result = x+y;
	}
	
	public void subtraction(int x, int y) {
		result = Math.abs(x-y);
	}

}
