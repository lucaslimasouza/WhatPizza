package whatpizza.test;

import whatpizza.model.Person;
import junit.framework.TestCase;

public class PersonTest extends TestCase {

	private Person person;

	public void testCreate() {
		assertNotNull(person);
		assertEquals("should return the name","Lucas", person.toString());
	}
	
	public void testGetPizzaNotes() {
		assertEquals("should return a HashMap","{}", person.pizzaNotes().toString());
	}
	
	public void testAddNotesAtPizzaNotes() {
		person.addNote("Pepperoni",5);
		assertTrue("should contains Pepperoni",person.pizzaNotes().containsKey("Pepperoni") );
		assertEquals("should return Pepperoni note",5, person.pizzaNotes().get("Pepperoni").intValue());
	}
	
	public void setUp() {
		person = new Person("Lucas");
	}
}
