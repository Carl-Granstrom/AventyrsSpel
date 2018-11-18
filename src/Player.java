import java.util.ArrayList;

public class Player implements Describable{
    private String name;                //Your name
    private int maxHealth;              //Starting and maximum health
    private int currHealth;             //Current player health
    private String beskrivning;         //Hur spelaren beskrivs
    private ArrayList<Item> inventory;   //alla föremål spelaren bär på

    @Override
    public String getDescription() {
        return this.beskrivning;
    }

}
