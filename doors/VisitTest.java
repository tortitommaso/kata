package doors;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
/* 
 * 100 doors in a row are all initially closed. You make
100 passes by the doors. The first time through, you
visit every door and toggle the door (if the door is
closed, you open it; if it is open, you close it).
The second time you only visit every 2nd door (door
#2, #4, #6, ...). The third time, every 3rd door
(door #3, #6, #9, ...), etc, until you only visit
the 100th door.

Question: What state are the doors in after the last
pass? Which are open, which are closed?

[Source http://rosettacode.org]
 */
public class VisitTest extends Visit {

	private Visit visit;

	@Before 
	public void createVisit() {
		visit = new Visit();
	}

	@Test
	public void firstVisit() {
		visit.timeNumber(1);
		List<Door> actual = visit.doors();
		for (Iterator iterator = actual.iterator(); iterator.hasNext();) {
			Door door = (Door) iterator.next();
			assertTrue(door.isOpen());
		}
	}
	
	@Test
	public void secondVisit() throws Exception {
		visit.timeNumber(2);
		List<Door> actual = visit.doors();
		assertFalse(actual.get(0).isOpen());
		assertTrue(actual.get(1).isOpen());
		assertFalse(actual.get(2).isOpen());
		assertTrue(actual.get(3).isOpen());
	}

	@Test
	public void thirdVisit() throws Exception {
		visit.timeNumber(3);
		List<Door> actual = visit.doors();
		assertFalse(actual.get(0).isOpen());
		assertFalse(actual.get(1).isOpen());
		assertTrue(actual.get(2).isOpen());
		assertFalse(actual.get(3).isOpen());
	}
	
	@Test
	public void lastVisit() throws Exception {
		visit.timeNumber(100);
		List<Door> actual = visit.doors();
		for (int i = 0; i < 99; i++) {
			assertFalse(actual.get(i).isOpen());			
		}
		assertTrue(actual.get(99).isOpen());
	}
	
	@Test
	public void solution() throws Exception {
		for (int i = 1; i < 101; i++) {
			visit.timeNumber(i);
		}
		List<Door> actual = visit.doors();
		for (int i = 0; i < actual.size(); i++) {
			System.out.print("Door number <" + i + "> is open: <" + actual.get(i).isOpen() + ">\n");
		}
	
	}
}
