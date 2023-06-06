package chapter6._5;

public class Singleton {
    private static Singleton single = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return single;
    }
}
