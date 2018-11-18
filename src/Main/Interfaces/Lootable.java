package Main.Interfaces;

import Main.Item;

/**
 * Inteface for objects that can be looted for items and gold
 */
public interface Lootable {
    public abstract Item[] lootItem();
}
