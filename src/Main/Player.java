package Main; /**
 * Spelaren.
 */

import Main.Interfaces.Describable;

import java.util.ArrayList;

public class Player implements Describable {
    private String name;                //Your name
    private int maxHealth;              //Starting and maximum health
    private int currHealth;             //Current player health
    private String beskrivning;         //Hur spelaren beskrivs
    private ArrayList<Item> inventory;  //Alla föremål spelaren bär på

    @Override
    public String getDescription() {
        return this.beskrivning;
    }

    //Pass an object to look at it(return it's description as a String)
    public String lookAt(Describable d) {
        return d.getDescription();
    }
}
