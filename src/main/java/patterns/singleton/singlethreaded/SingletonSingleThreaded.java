package patterns.singleton.singlethreaded;

import lombok.Getter;

public final class SingletonSingleThreaded {

    private static SingletonSingleThreaded INSTANCE;
    @Getter
    private String value;
    private SingletonSingleThreaded(String value) {
        this.value = value;
    }

    public static SingletonSingleThreaded getInstance(String value) {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSingleThreaded(value);
        }
        return INSTANCE;
    }
}
