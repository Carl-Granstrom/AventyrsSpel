package Main.Items;
/**
 * En klass som ska agera superclass åt olika typer av rumsföremål(dvs alla föremål som inte kan hållas av spelaren)
 */

import Main.Item;

public abstract class RoomItem extends Item {

    RoomItem(String itemName, String description) {
        super(itemName, description);
    }
}
