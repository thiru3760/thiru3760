package LibraryManagementSystem;

public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;
    private static int userIdCount = 0;

    public User() {
        this.userId = User.generateUniqueId();
    }

    public static String generateUniqueId() {
        return String.valueOf(userIdCount++);
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other) {
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();


}
