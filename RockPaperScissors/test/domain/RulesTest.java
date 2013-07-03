package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class RulesTest  {

	Rules rules = new Rules();

	@Test
	public void simpleCaseTest() {
		assertEquals(Gesture.ROCK, rules.whoIsTheWinner(new Combination(Gesture.ROCK, Gesture.SCISSORS)));
	}
	
	@Test
	public void noWinner() throws Exception {
		assertNull(rules.whoIsTheWinner(new Combination(Gesture.ROCK, Gesture.ROCK)));		
	}

}
