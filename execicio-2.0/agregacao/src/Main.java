import model.Classroom;
import model.Student;

public class Main {
    public static void main(String[] args) throws Exception {
       Classroom classroom = new Classroom();
       Student student = new Student("Fernando");
       classroom.addStudent(student);
       classroom.listStudents();
    }
}
