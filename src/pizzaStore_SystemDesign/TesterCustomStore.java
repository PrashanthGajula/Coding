package pizzaStore_SystemDesign;

import java.util.ArrayList;

public class TesterCustomStore extends OverlandParkPizzaStore{
	@Override
	Pizza createCustomPizza(String base, String sauce, ArrayList<Toppings> toppings) {
		return new CustomPizza("Organic"+base, "Organic"+sauce, toppings);
	}
}
