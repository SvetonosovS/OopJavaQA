package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поле Subject - выделен в отдельный класс с выводом и изменением информации.

public class GetTeacherSubject extends Teacher {
    public GetTeacherSubject(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public String getSubject() {
        return subject;
    }
}