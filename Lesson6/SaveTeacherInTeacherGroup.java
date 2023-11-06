package Lesson6;

// Используется принцип: Open Closed Principle (Принцип открытости/закрытости).
// Создан Класс SaveTeacherInGroup , который имплементирует созданный интерфейс SaveTeacherInTeacherGroup
// (c методом сохранения учителя в список);

// Используется принцип: Liskov’s Substitution Principle (Принцип подстановки Барбары Лисков).
// Используется принцип: Interface Segregation Principle (Принцип разделения интерфейса).
// Используется принцип: Dependency Inversion Principle (Принцип инверсии зависимостей).
// Создан интерфейс SaveTeachersInGroup

import java.util.List;

public abstract interface SaveTeacherInTeacherGroup{
    void saveTeacherInGroup(Teacher teacher, List<Teacher> teacherList);
}