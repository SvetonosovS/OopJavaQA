package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поле FirstName - выделен в отдельный класс с выводом и изменением информации.

public class GetFirstNameTeacher extends Teacher{
    public GetFirstNameTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }
    public String getFirstName() {
        return firstName;
    }
}