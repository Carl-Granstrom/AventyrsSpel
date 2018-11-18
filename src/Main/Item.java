package Main;

import Main.Interfaces.Describable;

public abstract class Item implements Describable {
    private String itemName;
    private String description;

    public Item(String itemName, String description) {
        this.itemName = itemName;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return this.description;
    }


}
