package miniwar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import miniwar.exceptions.NotEnoughPlayersException;
import miniwar.exceptions.PlayerNotInGameException;

/**
 * Main controller of the game organize game rounds and maintain player list
 */
public class Game {

    protected Integer rounds;
    private Integer currentRound;

    protected Map<String, Player> players = new HashMap<String, Player>();
    private List<Player> playOrder;

    public Game(Integer rounds) {
        this.rounds = rounds;
    }

    public void resetGame() {
        players.clear();
    }

    public void startGame() throws NotEnoughPlayersException {
        if (this.players.size() <= 1) {
            throw new NotEnoughPlayersException();
        }

        this.playOrder = new ArrayList<Player>();
        for (Player player : this.players.values()) {
            this.playOrder.add(player);
        }

        this.currentRound = 1;
        while (this.currentRound <= this.rounds) {
            this.playRound();
            this.currentRound += 1;
        }
    }

    public void playRound() {
        System.out.println("Round: " + this.currentRound);

        for (Player player : this.playOrder) {
            player.playRound(this.getOtherPlayers(player));
        }
    }

    public Set<Player> getOtherPlayers(Player player) {
        Set<Player> otherPlayers = new HashSet<Player>(this.playOrder);
        otherPlayers.remove(player);
        return otherPlayers;
    }

    public void addPlayer(Player player) {
        this.players.put(player.getName(), player);
    }

    public Boolean isPlayerInGame(String name) {
        return this.players.containsKey(name);
    }

    public Player getPlayerByName(String name) throws PlayerNotInGameException {
        if (!this.isPlayerInGame(name)) {
            throw new PlayerNotInGameException(name);
        }
        return players.get(name);
    }
}
