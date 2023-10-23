package Lesson4;


import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        Teacher javaTeacher = new Teacher("Ivan", "Ivanov", 48, "Java course");
        Teacher pythonTeacher = new Teacher("Stepan", "Stepanov", 32, "Python course");
        Teacher cSharpTeacher = new Teacher("Pavel", "Pavlov", 28, "C# course");
        Teacher webTeacher = new Teacher("Anna", "Petrova", 33, "Web course");
        Teacher gitTeacher = new Teacher("Aleksandr", "Petrovskii", 36, "Git course");

        teachers.add(javaTeacher);
        teachers.add(pythonTeacher);
        teachers.add(cSharpTeacher);
        teachers.add(webTeacher);
        teachers.add(gitTeacher);

        teachers.sort(new TeacherComparator<Teacher>());
        System.out.println(teachers);

        for (Teacher teach : teachers) {
            System.out.println(teach.getFirstName());
        }

        System.out.println("Teachers добавлены Teacher Group!");
        TeacherGroup list = new TeacherGroup(teachers);
        TeacherIterator teacherIterator = list.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next());

        }
    }
}