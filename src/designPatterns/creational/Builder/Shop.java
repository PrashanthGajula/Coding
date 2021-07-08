package designPatterns.creational.Builder;

public class Shop {
	
	public static void main(String[] args) {
		Phone p = new Phone("Android", 2, "Qualcom", 5.5, 1000);
		System.out.println(p);
		
		//Using external builder
		Phone p2 = new PhoneBuilder().setOs("Android").getPhone();
		System.out.println(p2);
		
		//Using a builder class.
		Phone p3 = Phone.Builder.create().setOs("IOS").setBattery(5000).build();
		System.out.println(p3);
	}
}
