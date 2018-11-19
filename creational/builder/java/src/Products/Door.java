package Products;

public class Door implements MapSite {

    private Room source;
    private Room destination;
    private boolean isOpen = false;

    public Door(Room source, Room destination) {
        this.source = source;
        this.destination = destination;
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
}
