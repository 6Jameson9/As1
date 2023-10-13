package Thread_Safety;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent direct instantiation.
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}

