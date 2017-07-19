package oncogene;

import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String candidate) {
		double healthyCtr = 0, cancerCtr = 0;
		double healthyPer, cancerPer;

		if (candidate.equals("")) {
			return false;
		} else if (healthySequences.size() == 0) {
			throw new IllegalArgumentException("healthySequences must contain at least one element");
		} else if (cancerSequences == null || healthySequences == null) {
			throw new NullPointerException("NullPointerException");
		} else if (cancerSequences.size() == 0) {
			throw new IllegalArgumentException("cancerSequences must contain at least one element");
		} 
		

		for (int i = 0; i < healthySequences.size(); i++) {
			// System.out.println(healthySequences.get(i) + " " +
			// healthySequences.get(i).contains(candidate));
			if (healthySequences.get(i).contains(candidate)) {
				healthyCtr++;
				// System.out.println("healthyCtr: " + healthyCtr + " i = " +
				// i);
			}
		}

		System.out.println("healthyCtr = " + healthyCtr);

		for (int j = 0; j < cancerSequences.size(); j++) {
			// System.out.println(cancerSequences.get(j) + " " +
			// cancerSequences.get(j).contains(candidate));
			if (cancerSequences.get(j).contains(candidate)) {
				cancerCtr++;
				// System.out.println("cancerCtr: " + cancerCtr + " i = " + j);
			}
		}

		System.out.println("cancerCtr = " + cancerCtr);

		healthyPer = (healthyCtr / healthySequences.size()) * 100;
		// System.out.println(healthyPer);
		cancerPer = (cancerCtr / cancerSequences.size()) * 100;
		// System.out.println(cancerPer);

		if (cancerPer > healthyPer) {
			System.out.println("True");
			return true;
		} else {
			System.out.println("False");
			return false;
		}
	}

}
