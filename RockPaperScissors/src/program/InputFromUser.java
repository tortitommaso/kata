package program;

import domain.Gesture;

public class InputFromUser {

	private String line;

	public InputFromUser(String line) {
		this.line = line.toUpperCase().trim();
	}

	public boolean isExit() {
		return "EXIT".equals(line);
	}

	public Gesture gestureChosen() {
		return Gesture.valueOf(line);
	}

	public boolean isInvalid() {
		try {
			Gesture.valueOf(line);
			return false;
		} catch (IllegalArgumentException e) {
			return true;
		}
	}

}
