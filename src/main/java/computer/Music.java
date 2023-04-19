package computer;

public interface Music {

    String NAME = "MUSIC";

    void playMusic();

    void pauseMusic();

    void stopMusic();


    //metoda domyslna
    default void sayHello() {
        System.out.println("Hello from default");
    }

    // metoda statyczna
    static String getName() {
        return NAME;
    }

    //prymitywna statyczna metoda
    public static void privateMethos() {
        System.out.println("hello from private method");
    }

}
