package question_no_5;

public interface Greeting {
    void sayHello(String name);

    default void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    static void staticGreet() {
        System.out.println("Static Greeting: Hello from interface!");
    }
}
