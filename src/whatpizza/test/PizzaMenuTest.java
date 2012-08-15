package whatpizza.test;

import whatpizza.model.PizzaMenu;
import junit.framework.TestCase;

public class PizzaMenuTest extends TestCase {
	
	private PizzaMenu menu;

	public void testCreateMenu() {
		assertNotNull("should not be null",menu);
	}
	
	public void testGetAllPizza() {
		assertEquals("should return some List","[]", menu.all().toString());
		
	}
	
	public void testAddPizza() {
		menu.add("Pepperoni");
		assertFalse(menu.all().isEmpty());
		assertTrue("should contains a Pepperoni Pizza", menu.all().contains("Pepperoni"));
	}
	
	public void testRemovePizza() {

		menu.add("Marguerita");
		menu.remove("Marguerita");
		assertTrue(menu.all().isEmpty());
		assertFalse("should not contains Marguerita Pizza",menu.all().contains("Marguerita"));
	}

	public void setUp() {
		menu = new PizzaMenu();
	}
}
