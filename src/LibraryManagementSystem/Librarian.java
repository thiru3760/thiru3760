package LibraryManagementSystem;

public class Librarian extends User {

    private String employeeNumber;

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard And Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {

    }

    void removeBook(Book book) {

    }

}
