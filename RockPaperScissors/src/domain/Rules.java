package domain;

import java.util.HashMap;
import java.util.Map;

public class Rules {

	private Map<Combination, Gesture> map = new HashMap<Combination, Gesture>();

	public Rules() {
		map.put(new Combination(Gesture.ROCK, Gesture.SCISSORS), Gesture.ROCK);
		map.put(new Combination(Gesture.PAPER, Gesture.SCISSORS), Gesture.SCISSORS);
		map.put(new Combination(Gesture.ROCK, Gesture.PAPER), Gesture.PAPER);
	}
	
	public Gesture whoIsTheWinner(Combination combination) {
		System.out.println(combination);
		Gesture result = map.get(combination);
		return result;
	}

}
