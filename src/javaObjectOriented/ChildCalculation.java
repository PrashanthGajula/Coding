package javaObjectOriented;

public class ChildCalculation extends BaseCalculation{
	public void multiply(int x, int y) {
		result = x*y;
	}
	
	public void display() {
		System.out.println(result);
	}
}
