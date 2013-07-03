package domain;

public class Game {

	private Gesture playerGesture;
	private Gesture pcGesture;

	public Game playerVersusPc(Gesture gestureChosen) {
		playerGesture = gestureChosen;
		pcGesture = Gesture.random();
		return this;
	}

	public String whoWins() {
		Gesture winningGesture = new Rules().whoIsTheWinner(new Combination(playerGesture ,  pcGesture));
		if (null == winningGesture)
			return "Draw";
		if (playerGesture.equals(winningGesture))
			return "Player Wins";
		else 
			return "Hal9000 Wins";
	}

}
