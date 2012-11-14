package miniwar.exceptions;

/**
 * Thrown when try to start a game with 0 or 1 player
 * @author Alexandre Terrasa
 */
public class NotEnoughPlayersException extends GameException {
    public NotEnoughPlayersException() {
        super("Not enough players to start a game.");
    }
}
