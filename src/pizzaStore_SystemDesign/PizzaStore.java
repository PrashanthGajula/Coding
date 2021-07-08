package pizzaStore_SystemDesign;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaStore {
	
	abstract Pizza createPizza(String item);
	abstract Pizza createCustomPizza(String base, String sauce, ArrayList<Toppings> toppings);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("Making a "+ pizza.getName() + "---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public Pizza orderCustomPizza(String base, String sauce, ArrayList<Toppings> toppings) {
		Pizza pizza = createCustomPizza(base, sauce, toppings);
		System.out.println("Making a "+ pizza.getName() + "---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
