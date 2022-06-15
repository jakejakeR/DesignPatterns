package patterns.singleton.singlethreaded;

import lombok.Getter;

public final class SingletonSingleThreaded {

    private static SingletonSingleThreaded instance;
    @Getter
    private String value;
    private SingletonSingleThreaded(String value) {
        this.value = value;
    }

    public static SingletonSingleThreaded getInstance(String value) {
        if (instance == null) {
            instance = new SingletonSingleThreaded(value);
        }
        return instance;
    }
}
