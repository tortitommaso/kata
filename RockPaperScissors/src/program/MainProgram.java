package program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import domain.Game;
import domain.Gesture;

public class MainProgram {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println(String.format("Commands [%s, EXIT]: ", Gesture.printAll()));
			InputFromUser input = new InputFromUser(br.readLine());
			if (input.isExit()) {
				System.out.println("Bye");
				return;
			}
			if (input.isInvalid()) continue;
			System.out.println(new Game().playerVersusPc(input.gestureChosen()).whoWins());
		} while (true);
	}
}
