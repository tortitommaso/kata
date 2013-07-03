package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CombinationTest  {

	@Test
	public void testEquals() {
		Combination combination = new Combination(Gesture.ROCK, Gesture.PAPER);
		assertEquals(combination, combination);
		Combination sameCombination = new Combination(Gesture.PAPER, Gesture.ROCK);
		assertEquals(combination, sameCombination);
	}

}
