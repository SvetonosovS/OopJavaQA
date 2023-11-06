package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Teacher javaTeacher = new Teacher("Ivan", "Ivanov", 48, "Java course");
        Teacher pythonTeacher = new Teacher("Stepan", "Stepanov", 32, "Python course");
        Teacher cSharpTeacher = new Teacher("Pavel", "Pavlov", 28, "C# course");
        Teacher webTeacher = new Teacher("Anna", "Petrova", 33, "Web course");
        Teacher gitTeacher = new Teacher("Aleksandr", "Petrovskii", 36, "Git course");

        List<Teacher> teachers = new ArrayList<>();

        SaveTeacherInGroup saveTeacherInGroup = new SaveTeacherInGroup();

        saveTeacherInGroup.saveTeacherInGroup(javaTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(pythonTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(cSharpTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(webTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(gitTeacher, teachers);
        
        ShowTeacherGroupList showTeacherGroupList = new ShowTeacherGroupList();
        showTeacherGroupList.showTeacher(teachers);

    } 
}