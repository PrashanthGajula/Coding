package pizzaStore_SystemDesign;

import java.util.ArrayList;
import java.util.List;

public class CustomPizza extends Pizza{
	CustomPizza(String base, String sauce, ArrayList<Toppings> toppings){
		this.name="Custom Pizza";
		this.dough = base;
		this.sauce = sauce;
		this.toppings = toppings;
	}

	void cut() {
		System.out.println("Cut large slices");
	}
}
