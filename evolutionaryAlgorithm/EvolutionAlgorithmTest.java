package evolution;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EvolutionAlgorithmTest extends EvolutionaryAlgorithm {

	@Test
	public void testFitnesse() {
		EvolutionaryAlgorithm evolutionAlgorithm = new EvolutionaryAlgorithm();
		assertEquals(3, evolutionAlgorithm.fitnesse("abc", "abc"));
		assertEquals(2, evolutionAlgorithm.fitnesse("abc", "acc"));
		assertEquals(1, evolutionAlgorithm.fitnesse("abc", "gbo"));
		assertEquals(0, evolutionAlgorithm.fitnesse("abc", "xxx"));
	}
	
	@Test
	public void testChooseBestCandidate() throws Exception {
		EvolutionaryAlgorithm evolutionaryAlgorithm = new EvolutionaryAlgorithm();
		String result = evolutionaryAlgorithm.chooseBestCandidate("ABC", listWith("AXY", "ABY", "XYZ"));
		assertEquals("ABY", result);
	}
	
	@Test
	public void testMutate() throws Exception {
		EvolutionaryAlgorithm evolutionaryAlgorithm = new EvolutionaryAlgorithm();
		int mutations = 0;
		for (int i = 0; i < 100; i++) {
			String result = evolutionaryAlgorithm.mutate("ABC");
			assertEquals(3, result.length());
			if (!result.equals("ABC")) mutations++;
		}
		assertTrue(mutations > 0);
	}
	
	private List<String> listWith(String... values) {
		return Arrays.asList(values);
	}

}
