package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поле age - выделен в отдельный класс с выводом и изменением информации.

public class GetAgeTeacher extends Teacher{
    public GetAgeTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public int getAgeTeacher() {
        return age;
    }

}