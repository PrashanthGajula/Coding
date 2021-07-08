package designPatterns.creational.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		//This will expose what inner classes are used for OS creation.
		OS operatingSystem = new Windows();
		operatingSystem.spec();
		
		//This hides the creation of the inner classes.
		OSFactory factory = new OSFactory();
		OS osObj = factory.getOS("Closed");
		osObj.spec();

	}

}
