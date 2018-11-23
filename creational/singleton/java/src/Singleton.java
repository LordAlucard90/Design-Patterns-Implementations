public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(Singleton.instance == null){
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assert singleton1 == singleton2;
    }
}
