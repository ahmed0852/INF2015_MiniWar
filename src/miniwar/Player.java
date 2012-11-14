package miniwar;

import java.util.List;

/**
 * Players can fight each others
 * @author Alexandre Terrasa
 */
public class Player {
    protected Integer life = 100;
    protected Integer force = 5;
    protected Integer dps = 2;
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public void playRound(List<Player> otherPlayers) {
        //@TODO add better player routine here
        for(Player player: otherPlayers) {
            this.attack(player);
            break;
        }
    }

    public void attack(Player player) {
        Integer damage = this.dps * this.force;
        System.out.println(this.getName() + " hits " + player.getName() + "(" + damage + ")");

        player.hurt(damage);
    }

    public void hurt(Integer damage) {
        this.life -= damage;
    }

    public Boolean isDead() {
        return this.life <= 0;
    }

    public String getName() {
        return name;
    }

}
