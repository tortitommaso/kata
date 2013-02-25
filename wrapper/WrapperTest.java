package wrapper;

import static org.junit.Assert.*;

import org.junit.Test;

public class WrapperTest extends Wrapper {

	@Test
	public void test() {
		assertEquals("Hel\nloW\norl\nd", new Wrapper().wrap("HelloWorld", 3));
		assertEquals("Hel\nlo\nWor\nld", new Wrapper().wrap("Hello World", 3));
		assertEquals("Hello\nWorld", new Wrapper().wrap("Hello World", 8));
	}

}
