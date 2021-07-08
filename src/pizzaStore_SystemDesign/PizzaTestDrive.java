package pizzaStore_SystemDesign;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore opStore = new OverlandParkPizzaStore();
		
		Pizza pizza = opStore.orderPizza("nystyle");
		System.out.println("Anurag ordered a "+ pizza.getName() + "\n");
		
		ArrayList<Toppings> topps = new ArrayList<>();
		topps.add(Toppings.bellpeppers);
		topps.add(Toppings.chicken);
		topps.add(Toppings.jaapenios);
		
		Pizza customPizza = opStore.orderCustomPizza("GF - thin crust", "marinara + white sauce", topps);
		System.out.println("Prashanth ordered "+ customPizza.getName() + "\n");

		PizzaStore newPopUpStore = new TesterCustomStore();
		Pizza p3 = newPopUpStore.orderCustomPizza("thin", "white sauce", topps);
		System.out.println("Hari ordered "+ p3.getName());
		
	}

}
