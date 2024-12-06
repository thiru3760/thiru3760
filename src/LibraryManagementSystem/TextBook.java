package LibraryManagementSystem;

public class TextBook extends Book {
    private String subject;
    private int edition;

    public TextBook() {
        super();
    }

    public TextBook(TextBook other) {
        super(other);
        this.subject = other.subject;
        this.edition = other.edition;
    }

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Subject: " + this.subject);
        System.out.println("Grade Level: " + this.edition);
    }
}
