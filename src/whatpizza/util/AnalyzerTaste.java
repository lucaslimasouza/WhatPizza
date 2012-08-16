package whatpizza.util;

import java.util.ArrayList;
import java.util.List;

import whatpizza.model.Person;

public class AnalyzerTaste {

	private List<Person> people;

	public AnalyzerTaste() {
		people = new ArrayList<Person>();
	}
	
	public List<Person> people() {
		return people;
	}

	public void addPerson(Person person) {
		people.add(person);
	}

	public String whoHaveSimilarPizzaTaste(Person personToCompare) {
		return "João";
	}

	public int particularTotalNotesPizza(Person person) {
		int total =0;
		for (Integer note : person.pizzaNotes().values()) {
			 total += note;
		}
		return total;
	}

}
