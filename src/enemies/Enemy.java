package enemies;

public abstract class Enemy {
    protected int health;
    protected int damage;
    protected String name;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " has " + health + " HP left.");
        }
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
