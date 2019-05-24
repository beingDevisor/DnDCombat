
package dndcombat;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author Mitchell Bath
 */
public abstract class Character implements Comparable<Character>, Serializable{

    String name;
    
    ArrayList<String> inventory = new ArrayList<>();
    
    //Used in encounters
    int initiative;
    
    int maxHealth;
    int health;
    int armorClass;
    
    public Character(String name, int maxHealth, int armorClass) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.armorClass = armorClass;
        
        this.initiative = -1;
        this.health = maxHealth;
    }
    
    //Compares based on initiative order
    //Backwards?
    @Override
    public int compareTo(Character character) {
        if (this.initiative > character.getInitiative()) {
            return -1;
        }
        if (this.initiative < character.getInitiative()) {
            return 1;
        }
        return 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
    
    public ArrayList<String> getInventory() {
        return inventory;
    }
    
    public void addToInventory(String item) {
        this.inventory.add(item);
    }

    public void removeFromInventory(String item) {
        this.inventory.remove(item);
    }
    
    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    
    
}
