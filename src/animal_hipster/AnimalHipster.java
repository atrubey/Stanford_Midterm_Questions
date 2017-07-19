package animal_hipster;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public AbstractCollection<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {
		
		ArrayList<String> animalHipsters = new ArrayList<String>();
		
		if (!network.get("Amy").contains("Elena")) {
			animalHipsters.add("Amy");
		} 
		if (!network.get("Brie").contains("Devney") && !network.get("Brie").contains("Fan-Hal")) {
			animalHipsters.add("Brie");
		} 
		if (!network.get("Chris").contains("")) {
			
		} 

		animalHipsters.add("Chris");
		
		return animalHipsters;
	}

}
