package Lesson6;

//Используется принцип: Single Responsibility Principle (Принцип единственной ответственности).
// Поля firstName,lastName,age,subject - выделены в отдельные классы с выводом и изменением
// информации каждого поля в отдельности.

public class Teacher extends User {
    protected String firstName; // поля стали защищенными (protected)
    protected String lastName;
    protected int age;
    protected String subject;

    public Teacher(String firstName, String lastName, int age, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "Name = " + firstName + '\'' +
                ", Surname = " + lastName + '\'' +
                ", age: " + age +
                ", subject: " + subject;
    }
}
