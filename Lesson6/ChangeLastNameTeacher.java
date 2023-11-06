package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поле LastName - выделен в отдельный класс с выводом и изменением информации.

public class ChangeLastNameTeacher extends Teacher{

    public ChangeLastNameTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}