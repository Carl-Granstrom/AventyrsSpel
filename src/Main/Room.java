package Main;

import Main.Interfaces.Describable;
import Main.Items.RoomItem;
import Main.Items.Trap;
import Main.Monsters.Monster;

import java.util.ArrayList;

public class Room implements Describable {

    private String description;
    private int roomDifficulty;
    private ArrayList<Trap> traps;
    private ArrayList<Monster> monsters;
    private ArrayList<RoomItem> items;

    Room(){
        description = "\nAnother dark, damp hellhole riddled with traps and monsters.";
    }

    @Override
    public String getDescription() {
        return description;
    }
}
