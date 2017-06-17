package model;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> students;

    public Teacher(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
