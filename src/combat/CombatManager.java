package combat;

import player.Player;
import enemies.Enemy;

public class CombatManager {
    public void attackEnemy(Player player, Enemy enemy) {
        System.out.println("Player attacks " + enemy.getName() + "!");
        enemy.takeDamage(10);
    }

    public void enemyAttack(Player player, Enemy enemy) {
        System.out.println(enemy.getName() + " attacks Player!");
        player.takeDamage(enemy.getDamage());
    }
}
