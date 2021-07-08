package pizzaStore_SystemDesign;

public class NYStyle_Pizza extends Pizza{
	public NYStyle_Pizza() {
		name = "NY style sauce and Cheese pizza";
		dough = "Thin crust";
		sauce = "Marinara sauce";
		
		toppings.add(Toppings.chicken);
		toppings.add(Toppings.onions);
	}
	
	@Override
	void cut()
	{
		System.out.println("Cut pizza NY style - large slizes");
	}

}
