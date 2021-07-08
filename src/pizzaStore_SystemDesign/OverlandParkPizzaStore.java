package pizzaStore_SystemDesign;

import java.util.ArrayList;
import java.util.List;

public class OverlandParkPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String item) {
		if(item.equals("nystyle")) {
			return new NYStyle_Pizza();
		}else if(item.equals("chicago")) {
			return new ChicagoStyle_Pizza();
		}else return null;
	}

	@Override
	Pizza createCustomPizza(String base, String sauce, ArrayList<Toppings> toppings) {
		return new CustomPizza(base, sauce, toppings);
	}

}
