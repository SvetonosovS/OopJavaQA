package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поле LastName - выделен в отдельный класс с выводом и изменением информации.

public class GetLastNameTeacher extends Teacher {
    public GetLastNameTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public String getLastName() {
    return lastName;
}
}