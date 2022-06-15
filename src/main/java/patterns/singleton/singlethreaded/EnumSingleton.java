package patterns.singleton.singlethreaded;

/**
 * Enum based singleton implementation.
 */
public enum EnumSingleton {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
