package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public enum Gesture {
	ROCK, SCISSORS, PAPER;

	public static String printAll() {
		String result = "";
		List<Gesture> all = Arrays.asList(Gesture.values());
		for (Iterator<Gesture> iterator = all.iterator(); iterator.hasNext();) {
			Gesture gesture = iterator.next();
			result += gesture.name();
			if (iterator.hasNext()) result += ", ";
		} 
		return result;
	}

	public static Gesture random() {
		List<Gesture> list = Arrays.asList(Gesture.values());
		Collections.shuffle(list);
		return list.get(0);
	}
}
