package patterns.singleton;
/*
1.  Add a private static field to the class for storing the singleton instance.
2.  Declare a public static creation method for getting the singleton instance.
3.  Implement “lazy initialization” inside the static method.
    It should create a new object on its first call and put it into the static field.
    The method should always return that instance on all subsequent calls.
4.  Make the constructor of the class private. The static method of the class will still be able
    to call the constructor, but not the other objects.
5.  Go over the client code and replace all direct calls to the singleton’s constructor
    with calls to its static creation method.
*/

import patterns.singleton.singlethreaded.Singleton;

/**
 * Good for managing a connection to a database
 */
public class SingletonApp {

    public static void main(String[] args) {

        System.out.println("Singleton design pattern practice\r\n");

        // Singleton single-threaded
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        // Checking how it would behave in multithreaded environment
        Thread threadHello = new Thread(new ThreadHello());
        Thread threadGoodbye = new Thread(new ThreadGoodbye());

        threadHello.start();
        threadGoodbye.start();

    }

    static class ThreadHello implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("HELLO!");
            System.out.println(singleton.getValue());
        }
    }
    static class ThreadGoodbye implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("GOODBYE!");
            System.out.println(singleton.getValue());
        }
    }
}
