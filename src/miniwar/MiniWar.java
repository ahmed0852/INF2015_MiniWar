package miniwar;

import miniwar.exceptions.NotEnoughPlayersException;

/**
 * game launcher
 * @author Alexandre Terrasa
 */
public class MiniWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotEnoughPlayersException {
        Game game = new Game(10);
        game.addPlayer(new Player("P1"));
        game.addPlayer(new Player("P2"));
        game.addPlayer(new Player("P3"));
        game.startGame();
    }
}
