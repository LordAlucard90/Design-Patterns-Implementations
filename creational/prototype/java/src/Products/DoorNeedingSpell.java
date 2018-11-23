package Products;

public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell() {
        super();
    }

    protected DoorNeedingSpell(DoorNeedingSpell doorNeedingSpell) {
        super(doorNeedingSpell);
    }

    @Override
    public Door clonePrototype() {
        return new DoorNeedingSpell(this);
    }
}
