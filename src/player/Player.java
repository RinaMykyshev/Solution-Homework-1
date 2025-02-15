package player;

import java.util.ArrayList;

public class Player {
    private int health;
    private int experience;
    private ArrayList<Object> inventory;

    public Player() {
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player has died!");
        } else {
            System.out.println("Player health: " + health);
        }
    }

    public void gainExperience(int xp) {
        experience += xp;
        System.out.println("Player gained " + xp + " XP. Total XP: " + experience);
    }

    public void addItem(Object item) {
        inventory.add(item);
        System.out.println("Player picked up: " + item.getClass().getSimpleName());
    }

    public int getHealth() {
        return health;
    }
}
