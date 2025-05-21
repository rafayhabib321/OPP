package question_no_5;

public class Main {
    public static void main(String[] args) {
        Greeting.staticGreet();

        Greeting g = new Welcome();
        g.sayHello("Alex");
        g.sayGoodbye();
    }
}
