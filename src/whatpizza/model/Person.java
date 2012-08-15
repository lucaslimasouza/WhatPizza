package whatpizza.model;

import java.util.HashMap;
import java.util.Map;

public class Person {

	private String name;
	private Map<String, Integer> pizzaNotes;

	public Person(String name) {
		this.name = name;
		pizzaNotes = new HashMap<String, Integer>();
	}

	@Override
	public String toString() {
		return name;
	}

	public Map<String, Integer> pizzaNotes() {
		return pizzaNotes;
	}

	public void addNote(String to, int note) {
		pizzaNotes.put(to, note);
	}
}
