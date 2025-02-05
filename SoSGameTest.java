package SoSGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.awt.event.ItemEvent;

public class SoSGameTest {

	private SoSGame game;
	
	@Test
	public void testGamePieceUpdate() {
		game = new SoSGame();
		game.checkbox1.setState(true); 
		game.checkbox1.dispatchEvent(new ItemEvent(game.checkbox1, ItemEvent.ITEM_STATE_CHANGED, game.checkbox1, ItemEvent.SELECTED));
		assertEquals("S", game.gamePiece, "Game piece should be 'S' when checkbox1 is selected.");
		
		game.checkbox2.setState(true); 
		game.checkbox2.dispatchEvent(new ItemEvent(game.checkbox2, ItemEvent.ITEM_STATE_CHANGED, game.checkbox2, ItemEvent.SELECTED));
		assertEquals("O", game.gamePiece, "Game piece should be 'O' when checkbox1 is selected.");
	
	}

}
