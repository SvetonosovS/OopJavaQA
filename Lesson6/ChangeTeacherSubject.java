package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поле Subject - выделен в отдельный класс с выводом и изменением информации.

public class ChangeTeacherSubject extends Teacher{

    public ChangeTeacherSubject(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }
    public void setTeacherSubject(String subject){
         this.subject = subject;
    }
}