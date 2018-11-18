public abstract class Monster implements Describable, Lootable {
    private String name;
    private int maxHealth;      //Starting and maximum health
    private int currHealth;     //Current monster health
    private int rustning;       //Rustningsvärdet dras av från skadan monsteret tar per slag
    private int skada;          //Hur mycket skada monstret gör per attack
    private String beskrivning; //Hur monstret beskrivs
    private Item[] loot;

    public Monster() {} //Här ska monster-gemensamma constructor-prylar in.

    @Override
    public String getDescription() {
        return this.beskrivning;
    }

    @Override
    public Item[] lootItem() {
        return this.loot;
    }
}
