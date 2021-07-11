package designPatterns.structural.Decorator;

public class PizzaMaker {
	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients : "+basicPizza.getDescription());
		System.out.println("Cost : "+basicPizza.getCost());
		
		Pizza basicPizza2 = new Mozzarella(new TomatoSauce(new PlainPizza()));
		System.out.println("Ingredients : "+basicPizza2.getDescription());
		System.out.println("Cost : "+basicPizza2.getCost());
	}

}
