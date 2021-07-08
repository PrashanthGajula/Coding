package pizzaStore_SystemDesign;

public class ChicagoStyle_Pizza extends Pizza{
	
	public ChicagoStyle_Pizza() {
		name="Chicago style pizza";
		dough="Thick dough";
		sauce="Tomato sauce";
	}
	
	@Override
	void cut() {
		System.out.println("Cut the pizza into square slices");
	}

}
