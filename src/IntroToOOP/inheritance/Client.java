package IntroToOOP.inheritance;

public class Client     {
    public static void main(String[] args) {
        User user = new User("John", "sdfsd", "sdfsdf");
        Instructor instructor = new Instructor("John", "sdfsd", "sdfsdf", new String[]{"Java", "Python"});
        user.printInfo();
        instructor.printInfo();


    }

}
