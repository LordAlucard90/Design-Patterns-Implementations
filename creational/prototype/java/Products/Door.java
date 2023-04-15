package Products;

public class Door implements MapSite {

    private Room source;
    private Room destination;
    private boolean isOpen = false;

    public Door() {
    }

    protected Door(Door door) {
        this.source = door.source;
        this.destination = door.destination;
        this.isOpen = false;
    }

    @Override
    public void enter() {
        if(isOpen){
            System.out.println("You can enter.");
        } else {
            System.out.println("You shall not pass!");
        }
    }

    public void open(){
        isOpen = true;
    }

    public void close(){
        isOpen = false;
    }

    @Override
    public Door clonePrototype() {
        return new Door(this);
    }

    public void initialize(Room source, Room destination) {
        this.source = source;
        this.destination = destination;
    }
}
