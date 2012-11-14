package miniwar.exceptions;

/**
 * Root of all exceptions thrown by the game
 * @author Alexandre Terrasa
 */
public class GameException extends Exception {
    public GameException(String message) {
        super(message);
    }
}
