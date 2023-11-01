package Lesson5;

import Lesson5.Model.Student;
import Lesson5.Model.Teacher;
import Lesson5.View.ModelView;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex Pushkin", 50, "001");
        Student student1 = new Student("Nik Gogol", 22, "k002");
        Student student2 = new Student("Lev Tolstoy", 20, "k003");
        ModelView modelView = new ModelView();
        modelView.saveGroup(new Teacher(teacher.getTeacherId()),
                (List.of(new Student(student1.getStudentId()), new Student(student2.getStudentId()))), "group1");
        modelView.getGroup("group1");
    }
}