package Products;

public class EnchantedRoom extends Room {
    private Spell spell;

    public EnchantedRoom(int number, Spell spell) {
        super(number);
        this.spell = spell;
    }
}
