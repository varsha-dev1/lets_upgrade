//Quiz Application (Main class)

package quiz_application;

public class ExecuteGame {	
	public static void main(String[] args) {		
		Game game = new Game();
        game.initializeGame();
        game.play();
	}
}
