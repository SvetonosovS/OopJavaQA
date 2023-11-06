package Lesson6;

// Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поля firstName,lastName - выделены в отдельные классы с выводом и изменением
// информации каждого поля в отдельности.

public class User {

    protected String firstName;  // // поля стали защищенными (protected)
    protected String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public User() {
    }
    public String getFirstName() {
        return firstName;
    }
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName;
    }
}