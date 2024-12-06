package LibraryManagementSystem;

public class Librarian extends User {

    private String employeeNumber;

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard And Employee Number: " + employeeNumber);
        System.out.println("name" + getName());
        System.out.println("contactInfo" + getContactInfo());

    }

    public Librarian(String employeeNumber) {
        super();
        this.employeeNumber = employeeNumber;
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public Librarian(Librarian other) {
        super(other);
        this.employeeNumber = other.employeeNumber;
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {
        System.out.println("Book Added:" );
    }

    void removeBook(Book book) {
        System.out.println("Book Removed:" );

    }

}
