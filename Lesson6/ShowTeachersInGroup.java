package Lesson6;

// Используется принцип: Liskov’s Substitution Principle (Принцип подстановки Барбары Лисков).
// Используется принцип: Interface Segregation Principle (Принцип разделения интерфейса).
// Используется принцип: Dependency Inversion Principle (Принцип инверсии зависимостей).
// Создан интерфейс SaveTeachersInGroup

import java.util.List;

public interface ShowTeachersInGroup extends SaveTeacherInTeacherGroup {

    public default void showTeacher(List<Teacher> teacherList) {
        for (Teacher list2 : teacherList)
            System.out.println(list2);

    }
}