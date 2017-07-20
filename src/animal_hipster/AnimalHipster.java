package animal_hipster;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public AbstractCollection<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {
		
		ArrayList<String> animalHipsters = new ArrayList<String>();
		boolean isAnimalHipster; 
		
		for (String person : network.keySet()) {
			isAnimalHipster = true; 
			for (String friend : network.get(person)) {
				if (favoriteAnimals.get(person) == favoriteAnimals.get(friend)) {
					isAnimalHipster = false; 
				}
			}
			if (isAnimalHipster) {
				animalHipsters.add(person);
			}
		}
		
		return animalHipsters;
	}

}
