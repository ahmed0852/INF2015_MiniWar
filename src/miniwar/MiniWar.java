package miniwar;

import miniwar.exceptions.NotEnoughPlayersException;

/**
 * Game launcher
 */
public class MiniWar {
    public static void main(String[] args) throws NotEnoughPlayersException {
        Game game = new Game(10);
        game.addPlayer(new Player("P1"));
        game.addPlayer(new Player("P2"));
        game.addPlayer(new Player("P3"));
        game.startGame();
    }
}
