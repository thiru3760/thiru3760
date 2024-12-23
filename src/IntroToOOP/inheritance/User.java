package IntroToOOP.inheritance;

public class User {
    public String name;
    public String email;
    public String password;

    public User() {
        this.name = "Unknown";
        this.email = "Unknown";
        this.password = "Unknown";
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public void logout() {
        System.out.println("Logged out");
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Password change failed");
        }
    }

    public void changeEmail(String password, String newEmail) {
        if (this.password.equals(password)) {
            this.email = newEmail;
            System.out.println("Email changed successfully");
        } else {
            System.out.println("Email change failed");
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
