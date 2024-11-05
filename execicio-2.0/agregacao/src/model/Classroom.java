package model;

import java.util.ArrayList;
import java.util.List;

public class Classroom{
    private List<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student); // Agregação: sala de aula contém estudantes
    }

    public void listStudents() {
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}
