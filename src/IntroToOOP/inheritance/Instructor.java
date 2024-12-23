package IntroToOOP.inheritance;

public class Instructor extends User {
    private String[] courses;

    private String name;
    private String email;
    private String password;

    public Instructor(String name, String email, String password, String[] courses) {
        super(name, email, password);
        this.courses = courses;
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Courses: ");
        for (String course : courses) {
            System.out.println(course);
        }

    }

}
