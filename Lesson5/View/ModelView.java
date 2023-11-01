package Lesson5.View;

import Lesson5.Controller.Controller;
import Lesson5.Model.Student;
import Lesson5.Model.Teacher;

import java.util.List;

public class ModelView {
    Controller controller = new Controller();

    public ModelView() {
        this.controller = controller;
    }

    public void saveGroup(Teacher teacherId, List<Student> studentId, String name){
        controller.createStudentGroup(teacherId,studentId,name);
    }

    public void getGroup(String name){
        System.out.println(controller.getByName(name));
    }

}