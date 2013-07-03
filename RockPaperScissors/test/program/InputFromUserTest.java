package program;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.Gesture;

public class InputFromUserTest  {

	@Test
	public void shouldAcceptSomeCommonInputErrors() {
		verifyInput(Gesture.PAPER, "PAPER");
		verifyInput(Gesture.PAPER, "paper");
		verifyInput(Gesture.PAPER, " paper   ");
	}
	
	@Test
	public void invalidInputTest() throws Exception {
		InputFromUser inputFromUser = new InputFromUser("not valid");
		assertTrue(inputFromUser.isInvalid());
	}

	@Test
	public void isExit() throws Exception {
		InputFromUser inputFromUser = new InputFromUser("exit");
		assertTrue(inputFromUser.isExit());
	}

	private void verifyInput(Gesture expected, String input) {
		InputFromUser inputFromUser = new InputFromUser(input);
		assertFalse(inputFromUser.isInvalid());
		assertFalse(inputFromUser.isExit());
		assertEquals(expected, inputFromUser.gestureChosen());
	}

}
