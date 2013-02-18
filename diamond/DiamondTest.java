package diamond;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondTest {

	@Test
	public void tryYourself() throws Exception {
		System.out.println(new Diamond().print("D"));
	}
	
	@Test
	public void charToIndex() {
		assertEquals(0, new Diamond().charToIndex("A"));
		assertEquals(1, new Diamond().charToIndex("B"));
	}
	
	@Test
	public void indexToChar() throws Exception {
		assertEquals('A', new Diamond().indexToChar(0));
		assertEquals('B', new Diamond().indexToChar(1));
	}

}
