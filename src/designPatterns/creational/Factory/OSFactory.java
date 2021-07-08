package designPatterns.creational.Factory;

public class OSFactory {
	
	public OS getOS(String str) {
		if(str.equals("open")) {
			return new Android();
		} else if (str.equals("Closed")) {
			return new IOS();
		} else 
			return new Windows();
	}

}
