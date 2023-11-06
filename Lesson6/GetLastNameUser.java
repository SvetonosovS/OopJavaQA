package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поле LastName - выделен в отдельный класс с выводом и изменением информации.

public class GetLastNameUser extends User {
    public GetLastNameUser(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getLastName() {
        return lastName;
    }
}