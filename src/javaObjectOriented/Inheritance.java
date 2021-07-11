package javaObjectOriented;

/**
 * Inheritance is defined as a process where one class acquires the properties (methods and fields) of a different class.
 * With use of inheritance the info is made manageable in a hierarchical order.
 * extend - is the keyword used to extend the properties of a class. 
 * 
 * @author prashanth
 *
 */
public class Inheritance {

	public static void main(String[] args) {
		ChildCalculation cal = new ChildCalculation();
		cal.add(1, 2);
		cal.display();
		cal.subtraction(10, 5);
		cal.display();
		cal.multiply(2, 4);
		cal.display();
		

	}
}
