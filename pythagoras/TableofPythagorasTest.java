package pythagoras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableofPythagorasTest  {

	@Test
	public void testSomeRows() {
		String result = new TableofPythagoras(10).print();
		String[] rows = result.split("\n");
		assertEquals(10, rows.length);
		assertEquals("  1|  2|  3|  4|  5|  6|  7|  8|  9| 10|", rows[0]);
		assertEquals("  6| 12| 18| 24| 30| 36| 42| 48| 54| 60|", rows[5]);
	}

}
