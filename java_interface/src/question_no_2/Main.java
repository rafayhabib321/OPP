package question_no_2;

public class Main {
    public static void main(String[] args) {
        Printable p1 = new Book("Java Programming", "James Gosling");
        Printable p2 = new Magazine("Tech Monthly", 45);

        p1.print();
        p2.print();
    }
}
