package whatpizza.util;

import java.util.ArrayList;
import java.util.Iterator;
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

	public Person whoHaveSimilarPizzaTaste(Person personToCompare) {
		int tasteTocompare = particularTotalNotesPizza(personToCompare);
		return  findSimilarPerson(tasteTocompare);
	}

	private Person findSimilarPerson(int tasteTocompare) {
		Person similarPerson = null;
		int similarTaste = tasteTocompare;
		for (Person person : people) {
			int clonessesTaste = calculateCloseTaste(tasteTocompare, person);
			if( clonessesTaste > 0 && clonessesTaste <= similarTaste){
				similarTaste = clonessesTaste;
				similarPerson = person;
			}}return similarPerson;
	}

	private int calculateCloseTaste(int tasteTocompare, Person person) {
		int clonessesTaste = (particularTotalNotesPizza(person) - tasteTocompare);
		if(clonessesTaste < 0) return clonessesTaste* -1;
		return clonessesTaste;
	}

	public int particularTotalNotesPizza(Person person) {
		int total =0;
		for (Integer note : person.pizzaNotes().values()) {
			 total += note;
		}return total;
	}

}
