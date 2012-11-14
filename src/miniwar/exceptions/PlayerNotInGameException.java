package miniwar.exceptions;

/**
 * Thrown when try to access to a non logged player
 * @author Alexandre Terrasa
 */
public class PlayerNotInGameException extends GameException {
    public PlayerNotInGameException(String player_name) {
        super("Player '" + player_name + "' not in game.");
    }
}
