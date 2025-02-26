package az.edu.turing.module2.Lesson20.HomeTask;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    // Constructor
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Methods
    public void register() {
        System.out.println(firstName + " has registered.");
    }

    public void login() {
        System.out.println(firstName + " has logged in.");
    }

    public void logout() {
        System.out.println(firstName + " has logged out.");
    }
}
