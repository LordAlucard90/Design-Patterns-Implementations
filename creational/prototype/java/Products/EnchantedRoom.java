package Products;

public class EnchantedRoom extends Room {
    private final Spell spell;

    public EnchantedRoom(Spell spell) {
        super();
        this.spell = spell;
    }

    protected EnchantedRoom(EnchantedRoom enchantedRoom) {
        super(enchantedRoom);
        this.spell = enchantedRoom.spell;
    }

    @Override
    public Room clonePrototype() {
        return new EnchantedRoom(this);
    }
}
