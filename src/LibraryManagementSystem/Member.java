package LibraryManagementSystem;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard and No of Books Borrowed: " + borrowedBooksCount);
        System.out.println("Can Borrow Books: " + canBorrowBooks());
        System.out.println("Total Users: " + User.getTotalUsers());
        System.out.println("name: " + getName());
        System.out.println("contactInfo: " + getContactInfo());
    }


    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    public Member() {
        super();
        borrowedBooksCount = 0;
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
