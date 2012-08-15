package whatpizza.model;

import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {

	private List<String> pizzas;

	public PizzaMenu() {
		pizzas = new ArrayList<String>();
	}
	
	public List<String> all() {
		return pizzas;
	}

	public void add(String tastePizza) {
		pizzas.add(tastePizza);
	}

	public void remove(String tastePizza) {
		pizzas.remove(tastePizza);
	}

}
