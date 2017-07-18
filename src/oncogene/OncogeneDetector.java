package oncogene;

import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String candidate) {
		int healthyCtr = 0, cancerCtr = 0; 
		double healthyPer, cancerPer;
		
		for (int i = 0; i < healthySequences.size(); i++) {
			if (healthySequences.get(i).contains(candidate)) {
				healthyCtr++;
				continue; 
			}
		}
		
		System.out.println("healthyCtr = " + healthyCtr);
		
		
		for (int j = 0; j < cancerSequences.size(); j++) {
			if (cancerSequences.get(j).contains(candidate)) {
				cancerCtr++;
				continue; 
			}
		}
		
		System.out.println("cancerCtr = " + cancerCtr);

		
		healthyPer = (healthyCtr / healthySequences.size()) * 100; 
		cancerPer = (cancerCtr / cancerSequences.size()) * 100; 

		if (cancerPer > healthyPer) {
			System.out.println("True");
			return true; 
		} else {
			System.out.println("False");
			return false; 
		}
	}
	

}
