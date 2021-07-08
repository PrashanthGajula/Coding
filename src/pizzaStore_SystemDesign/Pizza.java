package pizzaStore_SystemDesign;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<Toppings>	toppings = new ArrayList<>();
	
	void prepare() {
		System.out.println("Prepare "+ name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
		for(Toppings topping : toppings) {
			System.out.println(" " + topping);
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 mins at 350");
	}
	
	void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official pizza box");
	}
	
	public String getName() {
		return name;
	}
	

}
