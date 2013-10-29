/*
 * Copyright 2013 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package miniwar;

import java.util.Set;

/**
 * Players can fight each others
 */
public class Player {

    protected Integer life = 100;
    protected Integer force = 5;
    protected Integer dps = 2;
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public void playRound(Set<Player> otherPlayers) {
        //@TODO add better player routine here
        for (Player player : otherPlayers) {
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
