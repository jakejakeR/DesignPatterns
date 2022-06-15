package patterns.singleton.singlethreaded;

import lombok.Getter;

//Thread-safe Singleton with lazy loading
public class Singleton {

    private static Singleton instance;
    @Getter
    private String value;
    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {

        Singleton result = instance;

        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
