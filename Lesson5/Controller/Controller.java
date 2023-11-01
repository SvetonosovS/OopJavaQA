package Lesson5.Controller;

import Lesson5.Model.Student;
import Lesson5.Model.StudyGroup;
import Lesson5.Model.Teacher;
//import Lesson5.StudyGroupService.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<StudyGroup> studyGroup;

    public Controller() {
        this.studyGroup = new ArrayList<>();
    }

    public void createStudentGroup(Teacher teacherId, List<Student> studentId, String name) {
        studyGroup.add(new StudyGroup(teacherId, studentId, name));
        System.out.println("group has been added in controller");
    }

    public StudyGroup getByName(String name) {
        for (int i = 0; i < studyGroup.size(); i++) {
            if (studyGroup.get(i).getName().equals(name)) {
                System.out.println("group was found");
                return studyGroup.get(i);
            }
        }
        System.out.println("no group found!");
        return null;
    }

    public List<StudyGroup> getGroup() {
        return studyGroup;
    }

    public void setGroup(List<StudyGroup> studyGroup) {
        this.studyGroup = studyGroup;
    }

    @Override
    public String toString() {
        return "UserController{" +
                "group=" + studyGroup +
                '}';
    }
}