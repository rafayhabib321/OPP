package question_no_2;

public class Magazine implements Printable {
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    public void print() {
        System.out.println("Magazine: " + title + ", Issue #" + issueNumber);
    }
}
