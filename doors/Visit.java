package doors;

import java.util.ArrayList;
import java.util.List;

public class Visit {
	List<Door> doors = new ArrayList<Door>();
	
	public Visit() {
		for (int i = 0; i < 100; i++) {
			doors.add(new Door());
		}
	}

	public List<Door> doors() {
		return doors;
	}

	public void timeNumber(int number) {
		for (int i = number -1; i < doors.size(); i = i + number) {
			doors.get(i).toggle();
		}
	}
	
}
