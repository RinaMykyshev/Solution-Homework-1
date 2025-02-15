import player.Player;
import enemies.Skeleton;
import enemies.Zombie;
import enemies.Vampire;
import combat.CombatManager;
import items.*;
import level.LevelManager;
import score.ScoreManager;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player();
        CombatManager combatManager = new CombatManager();
        ItemManager itemManager = new ItemManager();
        LevelManager levelManager = new LevelManager();
        ScoreManager scoreManager = new ScoreManager();


        Skeleton skeleton = new Skeleton();
        Zombie zombie = new Zombie();
        Vampire vampire = new Vampire();


        combatManager.attackEnemy(player, skeleton);
        combatManager.enemyAttack(player, skeleton);

        combatManager.attackEnemy(player, zombie);
        combatManager.enemyAttack(player, zombie);

        combatManager.attackEnemy(player, vampire);
        combatManager.enemyAttack(player, vampire);


        GoldCoin goldCoin = new GoldCoin();
        HealthElixir elixir = new HealthElixir();
        MagicScroll scroll = new MagicScroll();

        itemManager.addItem(goldCoin);
        itemManager.addItem(elixir);
        itemManager.addItem(scroll);


        scoreManager.addScore(100);

        levelManager.nextLevel();
    }
}
