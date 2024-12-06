package LibraryManagementSystem;

public class Member extends User {
    private int borrowedBooksCount;
    private static int MAX_BORROW_LIMIT = 5;

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard and Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    public Member() {
        super();
    }

    public Member(int borrowedBooksCount) {
        super();
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(Member other) {
        super(other);
        this.borrowedBooksCount = other.borrowedBooksCount;
    }
}
