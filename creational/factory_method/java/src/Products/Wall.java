package Products;

public class Wall implements MapSite {
    @Override
    public void enter() {
        System.out.println("You shall not pass!");
    }
}
