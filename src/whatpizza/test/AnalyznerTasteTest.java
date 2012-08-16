package whatpizza.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import whatpizza.model.Person;
import whatpizza.util.AnalyzerTaste;
import junit.framework.TestCase;

public class AnalyznerTasteTest extends TestCase {

	private AnalyzerTaste analyzer;

	public void testCreate() {
		assertNotNull(analyzer);
	}
	
	public void testGetPeople() {
		assertEquals("should return a List","[]",analyzer.people().toString());
	}
	
	public void  testAddPerson() {
		Person person = mock(Person.class);
		analyzer.addPerson(person);
		assertTrue("should contains the same Person", analyzer.people().contains(person));
	}
	
	public void testParticularTotalNotesPizza() {
		int[] arrayNotes = {5,5,4};
		Map<String,Integer>  highNotes = buildHashhNotes(arrayNotes);
		Person person = mock(Person.class);
		when(person.pizzaNotes()).thenReturn(highNotes);
		assertEquals(14, analyzer.particularTotalNotesPizza(person));
	}
	
	public void testWhoHaveSimilarPizzaTaste() {
		Person similarTastePerson = buildSimilarTastePerson();
		Person wrongTastePerson = buildWrongTastePerson();
		analyzer.addPerson(similarTastePerson);
		analyzer.addPerson(wrongTastePerson);
		Person personToCompare = buildPersonToCompare();
		assertEquals(similarTastePerson.toString(),analyzer.whoHaveSimilarPizzaTaste(personToCompare).toString());
	}

	private Person buildPersonToCompare() {
		Person personToCompare = mock(Person.class);
		int[] arrayHighNotes = {3,3,1};
		Map<String,Integer> highNotes = buildHashhNotes(arrayHighNotes);
		when(personToCompare.pizzaNotes()).thenReturn(highNotes);
		return personToCompare;
	}

	private Person buildWrongTastePerson() {
		Person wrongTastePerson = mock(Person.class);
		int[] arraySlowNotes = {5,4,5};
		Map<String,Integer> slowNotes = buildHashhNotes(arraySlowNotes);
		when(wrongTastePerson.pizzaNotes()).thenReturn(slowNotes);
		when(wrongTastePerson.toString()).thenReturn("Wrong");
		return wrongTastePerson;
	}

	private Person buildSimilarTastePerson() {
		Person similarTastePerson = mock(Person.class);
		int[] arrayMiddleNotes = {5,5,1};
		Map<String, Integer> middleNotes = buildHashhNotes(arrayMiddleNotes);
		when(similarTastePerson.pizzaNotes()).thenReturn(middleNotes);
		when(similarTastePerson.toString()).thenReturn("João");
		return similarTastePerson;
	}
	
	private Map<String, Integer> buildHashhNotes(int[] arrayNotes) {
		Map<String, Integer> notes = new HashMap<String, Integer>();
		notes.put("Pepperoni",arrayNotes[0]);
		notes.put("Marguerita", arrayNotes[1]);
		notes.put("Napolitana", arrayNotes[2]);
		return notes;
	}
	
	public void setUp() {
		analyzer = new AnalyzerTaste();
	}
	
}
