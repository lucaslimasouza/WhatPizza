package whatpizza.test;

import whatpizza.model.PizzaMenu;
import junit.framework.TestCase;

public class PizzaMenuTest extends TestCase {
	
	public void testCreateMenu() {
		PizzaMenu menu = new PizzaMenu();
		assertNotNull(menu);
	}

}
