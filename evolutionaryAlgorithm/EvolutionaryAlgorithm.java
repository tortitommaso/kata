package evolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvolutionaryAlgorithm {

	private List<String> allowedChar = new ArrayList<String>();

	public EvolutionaryAlgorithm() {
		for(char c : "ABCDEFGHILMNOPQRSTUVZ".toCharArray()) {
		    allowedChar.add(String.valueOf(c));
		}
	}
	
	public int fitnesse(String target, String candidate) {
		int howManyCommonsChar = 0;
		for (int i = 0; i < target.length(); i++) {
			String target_char = target.substring(i, i+1);
			String candidate_char = candidate.substring(i, i+1);
			if (target_char.equals(candidate_char)) howManyCommonsChar++;
		}
		return howManyCommonsChar;
	}

	public String mutate(String target) {
		char[] result = target.toCharArray();
		int howManyCharsToChange = new Random().nextInt(target.length());
		for (int i = 0; i < howManyCharsToChange; i++) {
			int indexToChange = new Random().nextInt(target.length());
			int randomChar = new Random().nextInt(allowedChar.size());
			result[indexToChange]  = allowedChar.get(randomChar).toCharArray()[0];
		}
		return new String(result);
	}

	public String chooseBestCandidate(String target, List<String> candidates) {
		int maxCommonChars = 0 ; 
		String choosen = "";
		for (String candidate : candidates) {
			int fitnesseValueForThisCandidate = fitnesse(target, candidate);
			if (fitnesseValueForThisCandidate > maxCommonChars)  {
				maxCommonChars = fitnesseValueForThisCandidate;
				choosen = candidate;
			}
		}
		return choosen;
	}

	public static void main(String[] args) {
		int loopCount = 0;
		String target = "METHINKS IT IS LIKE A WEASEL";
		EvolutionaryAlgorithm evolutionaryAlgorithm = new EvolutionaryAlgorithm();
		String bestCandidate = evolutionaryAlgorithm.mutate(target);
		while (!target.equals(bestCandidate)) {
			List<String> candidates = new ArrayList<String>();
			for (int i = 0; i < 3; i++) {
				candidates.add(evolutionaryAlgorithm.mutate(target));
			}
			bestCandidate = evolutionaryAlgorithm.chooseBestCandidate(target, candidates);
			loopCount++;
			System.out.println(String.format("After %d loop, our best candidate is <%s> with a fitnesse value of (%d / %d)", 
					loopCount, 
					bestCandidate, 
					evolutionaryAlgorithm.fitnesse(target, bestCandidate), 
					evolutionaryAlgorithm.fitnesse(target, target)));
		}
	}
}
