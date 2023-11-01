package Lesson4;

//import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{

    public List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {

        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherList=" + teacherList +
                '}';
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }


    @Override
    public TeacherIterator iterator() {
        return new  TeacherIterator(teacherList);
    }
}
