package LibraryManagementSystem;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {
        isAvailable = true;
    }

    public Book(Book other) {
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user) {

        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        this.isAvailable = true;

    }

    @Override
    public boolean isAvailable() {
        return this.isAvailable;
    }

    public abstract void displayBookDetails();
}
